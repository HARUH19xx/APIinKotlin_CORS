window.onload = function () {
    fetch('http://localhost:8080/hello')
        .then(response => response.text())
        .then(data => {
            document.getElementById('message').textContent = data;
        })
        .catch(error => console.error('Error:', error));
};
