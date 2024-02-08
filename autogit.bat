cd C:\Users\DAM1_Alu02\Documents\GitHub\DAM1_archives
@echo off
start "" "C:\Users\DAM1_Alu02\Documents\GitHub\DAM1_archives\Dam1_web-main\pages\Cc2.png"
timeout /t 1 >nul
taskkill /f /im Microsoft.Photos.exe

git add --all
git commit -m "autoCommit %date:~-4%/%date:~3,2%/%date:~0,2%. Hora: %time:~0,2%:%time:~3,2%"
git push
exit