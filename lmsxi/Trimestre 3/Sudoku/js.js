let input = document.getElementById("input" + 1);
let celda = document.getElementById("celda" + 1);

document.getElementById("botonComprobar").onclick = function comprobar() {
    for(let i=1; i<=9; i++){
        for(let j=1; j<=9; j++){
            
            let input = document.getElementById("input"+i+'.'+j);
            let celda = document.getElementById(i+'.'+j);
    
            if(isNaN (input.value)){
                celda.style.backgroundColor = "#b82200a9";
    
            }else if(0<input.value){
                celda.style.backgroundColor = "";
    
            }else{
                celda.style.backgroundColor = "#45ff34ad";
            }
        }
    }
}

document.getElementById("botonLimpiar").onclick = function comprobar() {
    for(let i=1; i<=9; i++){
      for(let j=1; j<=9; j++){
          
          let input = document.getElementById("input"+i+'.'+j);
          let celda = document.getElementById(i+'.'+j);

          celda.style.backgroundColor = "#ffffff00";
          restaurarHover();
          
      }
  }
  
}

function restaurarHover() {
  var cells = document.querySelectorAll('td');

  cells.forEach(function(cell) {
      cell.style.backgroundColor = '';
  });
}

function CeroProhibido(input) {
  var valor = input.value;

  if (valor === '0') {
      input.value = '';
      
  }
}

document.addEventListener('DOMContentLoaded', function hovers() {
  var cells = document.querySelectorAll('td');

  function handleClick() {
    cells.forEach(function(cell) {
      cell.classList.remove('hover-row');
      cell.classList.remove('hover-column');
    });

    var cellId = this.id;
    var [row, column] = cellId.split('.');

    cells.forEach(function(target) {
      if (target.id.startsWith(row + '.')) {
        target.classList.add('hover-row');
      }
    });

    cells.forEach(function(target) {
      if (target.id.endsWith('.' + column)) {
        target.classList.add('hover-column');
      }
    });
  }

  cells.forEach(function(cell) {
    cell.addEventListener('click', handleClick);
  });

  document.addEventListener('click', function(event) {
    if (!event.target.closest('td')) {
      cells.forEach(function(cell) {
        cell.classList.remove('hover-row');
        cell.classList.remove('hover-column');
      });
    }
  });
})
