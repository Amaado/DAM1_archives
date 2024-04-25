let input = document.getElementById("input" + 1);
let celda = document.getElementById("celda" + 1);

document.getElementById("Boton").onclick = function comprobar() {
    for(let i=1; i<=9; i++){
        for(let j=1; j<=9; j++){
            
            let input = document.getElementById("input"+i+'.'+j);
            let celda = document.getElementById(i+'.'+j);
    
            if(isNaN (input.value)){
                celda.style.backgroundColor = "red";
    
            }else if(0<input.value){
                celda.style.backgroundColor = "";
    
            }else{
                celda.style.backgroundColor = "green";
            }
        }
    }
}



document.addEventListener('DOMContentLoaded', function() {
    // Obtener todas las celdas de la tabla
    var cells = document.querySelectorAll('td');

    // Función para manejar el clic en una celda
    function handleClick() {
      // Limpiar todas las clases de estilo "hover" de las celdas
      cells.forEach(function(cell) {
        cell.classList.remove('hover-row');
        cell.classList.remove('hover-column');
      });

      // Obtener el ID de la celda objetivo
      var cellId = this.id;
      // Obtener el número de fila y columna de la celda objetivo
      var [row, column] = cellId.split('.');

      // Agregar clase de estilo "hover" a la fila
      cells.forEach(function(target) {
        if (target.id.startsWith(row + '.')) {
          target.classList.add('hover-row');
        }
      });

      // Agregar clase de estilo "hover" a la columna
      cells.forEach(function(target) {
        if (target.id.endsWith('.' + column)) {
          target.classList.add('hover-column');
        }
      });
    }

    // Agregar evento de clic a cada celda
    cells.forEach(function(cell) {
      cell.addEventListener('click', handleClick);
    });
  });


/*
let hoverTargets = document.querySelectorAll('.limitador');

hoverTargets .forEach(function(cell) {
    cell.addEventListener('mouseover', function(){
        hoverTargets.forEach(function(target){
            target.classList.add('hover');
        });
    });

    cell.addEventListener('mouseout', function(){
        hoverTargets.forEach(function(target){
            target.classList.remove('hover');
        });
    });
});*/



