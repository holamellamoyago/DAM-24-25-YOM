//Eva 

Ejemplo de intimidad inadecuada (intimate inadequacy)

En este caso, la clase Empleado accede directamente a los detalles de implementación internos de Nomina mediante getSalario() y setSalario(), lo que crea una relación demasiado estrecha entre ambas clases, carece de encapsulamiento. 

Idealmente, Nomina debería encargarse de la gestión del salario y la clase Empleado debería interactuar con ella a través de métodos, sin manipular directamente sus atributos.