document.getElementById("botonRegistrar").onclick = function botonRegistro() {
    let etiquetaNombre = document.getElementById("etiquetaNombre");
    let etiquetaApellido = document.getElementById("etiquetaApellido");
    let etiquetaDni = document.getElementById("etiquetaDni");
    let etiquetaEmail = document.getElementById("etiquetaEmail");

    let nombre = document.getElementById("campoNombre");
    let apellido = document.getElementById("campoApellido");
    let dni = document.getElementById("campoDni");
    let email = document.getElementById("campoEmail");
    let mensaje = document.getElementById("mensaje");


    etiquetaNombre.style.color = "black";
    etiquetaNombre.textContent = "Nombre:";
    etiquetaApellido.style.color = "black";
    etiquetaApellido.textContent = "Apellido:";
    etiquetaDni.style.color = "black";
    etiquetaDni.textContent = "DNI:";
    etiquetaEmail.style.color = "black";
    etiquetaEmail.textContent = "Email:";
    nombre.style.backgroundColor = "white";
    apellido.style.backgroundColor = "white";
    dni.style.backgroundColor = "white";
    email.style.backgroundColor = "white";

    if (nombre.value === "" || apellido.value === "" || dni.value.value === "" || email.value.value === "") {
        if(nombre.value === ""){
            etiquetaNombre.style.color = "red";
            etiquetaNombre.textContent = "*Nombre:";
            nombre.style.backgroundColor = "#ff00004f";
        }
        
        if(apellido.value === ""){
            etiquetaApellido.style.color = "red";
            etiquetaApellido.textContent = "*Apellido:";
            apellido.style.backgroundColor = "#ff00004f";
        }
        
        if(dni.value === ""){
            etiquetaDni.style.color = "red";
            etiquetaDni.textContent = "*DNI:";
            dni.style.backgroundColor = "#ff00004f";
        }
        
        if(email.value === ""){
            etiquetaEmail.style.color = "red";
            etiquetaEmail.textContent = "*Email:";
            email.style.backgroundColor = "#ff00004f";
        }
        
        mensaje.style.visibility = "visible";
        mensaje.textContent = "No dejes campos en blanco!";
        return;

    } else {
        let dniTodos = document.getElementsByClassName("dni");
        let dniRepetido = false;

        for (let i = 0; i < dniTodos.length; i++) {
            if (dni.value === dniTodos[i].textContent.trim()) {
                dniRepetido = true;
                break;
            }
        }

        if (dniRepetido) {
            etiquetaDni.style.color = "red";
            etiquetaDni.textContent = "*DNI:";
            dni.style.backgroundColor = "#ff00004f";
            mensaje.style.visibility = "visible";
            mensaje.textContent = "El DNI ya existe";
            return;
        }else{
            mensaje.style.visibility = "hidden";

            let valorNombreG = document.createElement("div");
            valorNombreG.classList.add("usuarioInput");
            valorNombreG.classList.add("nombre");
            valorNombreG.textContent = nombre.value;

            let usuarioContainerNombre = document.createElement("div");
            usuarioContainerNombre.classList.add("usuarioContainer");



            let valorApellidoG = document.createElement("div");
            valorApellidoG.classList.add("usuarioInput");
            valorApellidoG.classList.add("apellido");
            valorApellidoG.textContent = apellido.value;

            let usuarioContainerApellido = document.createElement("div");
            usuarioContainerApellido.classList.add("usuarioContainer");



            let valorDniG = document.createElement("div");
            valorDniG.classList.add("usuarioInput");
            valorDniG.classList.add("dni");
            valorDniG.textContent = dni.value;

            let usuarioContainerDni = document.createElement("div");
            usuarioContainerDni.classList.add("usuarioContainer");



            let valorEmailG = document.createElement("div");
            valorEmailG.classList.add("usuarioInput");
            valorEmailG.classList.add("email");
            valorEmailG.textContent = email.value;

            let usuarioContainerEmail = document.createElement("div");
            usuarioContainerEmail.classList.add("usuarioContainer");



            let usuario = document.createElement("div");
            usuario.classList.add("usuario");

            usuario.appendChild(valorNombreG);
            usuario.appendChild(valorApellidoG);
            usuario.appendChild(valorDniG);
            usuario.appendChild(valorEmailG);
            document.getElementById("containerAnhadir").appendChild(usuario);
        }
    }
}


document.addEventListener("DOMContentLoaded", function() {
    let barraBusqueda = document.getElementById("barraBusqueda");
    let usuarios = document.getElementsByClassName("usuario");
    let nombres = document.getElementsByClassName("nombre");

    if (barraBusqueda) {
        barraBusqueda.addEventListener("input", function() {
            let resultadoBusqueda = barraBusqueda.value.trim().toLowerCase();
            

            if (resultadoBusqueda !== "") {
                for(let i=0; i<usuarios.length; i++){
                    let nombreActual = nombres[i].textContent.toLowerCase();

                    if(nombreActual.includes(resultadoBusqueda)){
                        usuarios[i].style.display = "flex";
                    }else{
                        usuarios[i].style.display = "none";
                    }
                }
            }else{
                for(let i=0; i<usuarios.length; i++){
                    usuarios[i].style.display = "flex";
                }

            }


        });

    }
});


