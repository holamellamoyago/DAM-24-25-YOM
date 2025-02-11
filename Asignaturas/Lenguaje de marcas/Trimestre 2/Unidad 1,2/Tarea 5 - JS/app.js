document.getElementById("ntf").addEventListener("click", function(event) {
    event.preventDefault();  // Evita que el formulario se envíe y la página se recargue

    // Verificar si ya se ha concedido permiso para mostrar notificaciones
    if (Notification.permission === "granted") {
        new Notification("Has enviado el formulario");
    } else if (Notification.permission !== "denied") {
        // Si no se ha denegado el permiso, solicita permiso al usuario
        Notification.requestPermission().then(function(permission) {
            if (permission === "granted") {
                new Notification("Has enviado el formulario");
            }
        });
    }
});
