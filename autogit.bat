cd C:\Users\DAM1_Alu02\Documents\GitHub\DAM1_archives


git add --all
# git commit -m "autoCommit %date:~-4%/%date:~3,2%/%date:~0,2%. Hora: %time:~0,2%:%time:~3,2%"
git commit -m "autoCommit %date:~-4%/%date:~3,2%/%date:~0,2%. Hora: %time:~0,2%:%time:~3,2% | IP: $(ipconfig | findstr IPv4 | findstr /v 127.0.0.1 | findstr /v 0.0.0.0 | findstr /v 169.254.)"
git push
exit