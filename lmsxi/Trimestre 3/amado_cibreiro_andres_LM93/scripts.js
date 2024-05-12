window.onload = function () {
    let nombres = ['1', '2', '3', '4', '5', '6', '7', '8'];
    let mainContainer = document.createElement('div');
    let score = 0;
    let attempts = 0;
    let scoreBoard = null;
    let audio = new Audio('img/mp3.mp3'); // Ruta al archivo MP3
    mainContainer.classList.add("mainContainer");

    let scoreText, attemptsText; // Definir globalmente para fácil acceso


    function setupScoreBoard() {
        if (!scoreBoard) {
            let blank1 = document.createElement('div');
            blank1.classList.add('blank1');

            scoreBoard = document.createElement('div');
            scoreBoard.classList.add('score-board');
            
            let scoreImg = document.createElement('img');
            scoreImg.src = 'img/scoreIcon.png';
            scoreImg.alt = 'Puntuación';
            scoreImg.classList.add('scoreIcon');
            
            let attemptsImg = document.createElement('img');
            attemptsImg.src = 'img/attemptsIcon.png';
            attemptsImg.alt = 'Intentos';
            attemptsImg.classList.add('attemptsIcon');

            scoreText = document.createElement('span'); // Ahora son accesibles globalmente
            attemptsText = document.createElement('span');
            
            scoreText.textContent = '0';
            attemptsText.textContent = '0';
            
            let scoreContainer = document.createElement('div');
            scoreContainer.classList.add('scoreContainer');

            scoreContainer.appendChild(scoreText);
            scoreContainer.appendChild(scoreImg);
            scoreContainer.appendChild(document.createTextNode('   '));
            scoreContainer.appendChild(attemptsText);
            scoreContainer.appendChild(attemptsImg);

            
            scoreBoard.appendChild(scoreContainer);
            document.body.appendChild(blank1);
            
        }
    }
    
    setupScoreBoard();

    function updateScore(isMatch) {
        if (isMatch) {
            score += 10;
        } else {
            score -= 2;
            score = Math.max(0, score);  // Prevenir puntuaciones negativas
        }
        attempts++;
        scoreText.textContent = score; // Asegura que estos son los elementos correctos
        attemptsText.textContent = attempts;
    }

    function checkForMatch() {
        if (flippedCards[0].dataset.cardName === flippedCards[1].dataset.cardName) {
            flippedCards.forEach(card => {
                card.classList.add('matched');
                const overlay = card.querySelector('.overlay');
                overlay.classList.add('active-marker');
            });
            updateScore(true);  // Actualizar la puntuación aquí por coincidencia
            resetFlips();
            // Comprobar si se ha ganado la partida
            if (document.querySelectorAll('.matched').length === nombres.length * 2) {
                showWinAnimation(); // Llamar a la función que muestra el video
            }
        } else {
            setTimeout(() => {
                flippedCards.forEach(card => {
                    card.classList.remove('flipped');
                    const overlay = card.querySelector('.overlay');
                    overlay.classList.remove('active-marker');
                });
                updateScore(false);
                resetFlips();
            }, 1000);
        }
    }
    
    function showWinAnimation() {
        let frameIndex = 0;
        const totalFrames = 675; // Total number of PNG images from 00000 to 00763
        let animationContainer = document.createElement('div');
        animationContainer.style.position = 'fixed';
        animationContainer.style.top = '0';
        animationContainer.style.left = '0';
        animationContainer.style.width = '100vw';
        animationContainer.style.height = '100vh';
        animationContainer.style.display = 'flex';
        animationContainer.style.alignItems = 'center';
        animationContainer.style.justifyContent = 'center';
        animationContainer.style.zIndex = '10000';
        animationContainer.style.overflow = 'hidden';  // Prevent any scrolling

        let animationImage = document.createElement('img');
        animationImage.draggable = false; // Prevent image from being dragged
        animationImage.onmousedown = () => false; // Prevent interaction while animation is playing
        animationContainer.appendChild(animationImage);
        document.body.appendChild(animationContainer);

        audio.play();

        const updateFrame = () => {
            if (frameIndex < totalFrames) {
                let frameNumber = frameIndex.toString().padStart(5, '0'); // Ensure the frame number is zero-padded
                animationImage.src = `img/secuencia/win_${frameNumber}.png`; // Adjust the path
                frameIndex++;
            } else {
                clearInterval(intervalId);
                document.body.removeChild(animationContainer);
            }
        };

        let intervalId = setInterval(updateFrame, 15); // Update every 21ms, approx 48 FPS for 2x speed
    }

    function shuffleArray(array) {
        for (let i = array.length - 1; i > 0; i--) {
            const j = Math.floor(Math.random() * (i + 1));
            [array[i], array[j]] = [array[j], array[i]];
        }
    }

    let allNames = [...nombres, ...nombres];
    shuffleArray(allNames);

    function createCard(src) {
        let card = document.createElement('div');
        card.classList.add('card');
        card.dataset.cardName = src; // Identificador de la carta
    
        let imgBack = document.createElement('img');
        imgBack.src = 'img/back.png';
        imgBack.classList.add('back');
        imgBack.draggable = false;
        imgBack.style.userSelect = "none";
    
        let imgFront = document.createElement('img');
        imgFront.src = `img/${src}.png`;
        imgFront.classList.add('front');
        imgFront.draggable = false;
        imgFront.style.userSelect = "none";
    
        let overlay = document.createElement('div');
        overlay.classList.add('overlay', 'marker');
        overlay.style.position = 'absolute';
        overlay.style.top = 0;
        overlay.style.left = 0;
        overlay.style.width = '100%';
        overlay.style.height = '100%';
        overlay.style.background = 'rgba(0,0,0,0)';
        overlay.style.pointerEvents = 'none';
        
        card.appendChild(imgBack);
        card.appendChild(imgFront);
        card.appendChild(overlay);
    
        card.onclick = function() {
            if (waiting || card.classList.contains('flipped') || card.classList.contains('matched')) return;
            card.classList.add('flipped');
            flippedCards.push(card);
        
            if (flippedCards.length === 2) {
                waiting = true;
                checkForMatch();
            }
        };
    
        return card;
    }

    function addImagesToContainer(container, imageNames) {
        imageNames.forEach(nombre => {
            container.appendChild(createCard(nombre));
        });
    }

    let flippedCards = [];
    let waiting = false;

    function flipCard(card) {
        if (waiting || card.classList.contains('flipped') || card.classList.contains('matched')) return;
        card.classList.add('flipped');
        flippedCards.push(card);
    
        if (flippedCards.length === 2) {
            waiting = true;
            checkForMatch();
        }
    }

    function resetFlips() {
        // Remueve la clase 'flipped' de todas las cartas que no han coincidido
        flippedCards.forEach(card => {
            if (!card.classList.contains('matched')) {
                card.classList.remove('flipped');
            }
        });
        // Limpia el array de cartas volteadas
        flippedCards = [];
        // Permite nuevas acciones
        waiting = false;
    }

    let container1 = document.createElement('div');
    container1.classList.add("container");
    addImagesToContainer(container1, allNames.slice(0, 8));

    let container2 = document.createElement('div');
    container2.classList.add("container");
    addImagesToContainer(container2, allNames.slice(8));

    mainContainer.appendChild(container1);
    mainContainer.appendChild(container2);

    document.body.appendChild(mainContainer);
    document.body.appendChild(scoreBoard);
};