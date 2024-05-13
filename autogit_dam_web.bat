# Obtener la dirección IP
for /f "tokens=2 delims=:" %%a in ('ipconfig ^| find "IPv4"') do (
    set ip_address=%%a
)

# Eliminar espacios en blanco al principio y al final de la dirección IP
set ip_address=%ip_address:~1%

# Agregar los comandos de Git
cd \Dam1_web
git add --all
git commit -m "%date:~-4%/%date:~3,2%/%date:~0,2%. Hora: %time:~0,2%:%time:~3,2% | IP: %ip_address%"
git push

exit