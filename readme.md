懸案だったCORSの問題が解決しました。<br>
どうやら、CORSの許可をする前にhttp通信を許可しないといけないようです。<br>

まず、SpringSecurityを追加しHttpSecurityを許可します。その後、CORSを許可することで、初めて通信が可能になります。<br>