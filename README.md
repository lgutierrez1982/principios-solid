# Principios Solid

# Definión:

# Single responsability(SRP)	
  -Una clase debe tener una, y solo una, razón para cambiar<br/> 					
  -Una clase debe tener una unica responsabilidad								
  
# Open-Closed(OCP)
  -Las entidades deben estar abierta a extension, pero cerradas a modificacion, con entidades hablamos de metodos, clases,etc.
  
# Liskov Subtitution(LSP)									
  -Si S es un subtitpo de T, T puede ser reemplazada con objetos del tipo S, sin alterar el comportamiento esperado del programa.<br/> 			
  -En otras palabras toda clase que es hija de otra clase debe poder utilizarse como si fuese el mismo padre.<br/>				
  -Nadie que necesite utilizar el padre tiene que comportarse diferente si interactua con cualquiera de sus descendientes	
  
# Interface Segregation(ISP)				
  -Ninguna clase debe ser forzado a depender de metodos que no usa<br/>			
  -Es mejor tener muchas clases especializadas, que tener mucho codigo en una clase donde no se usa el 100% de estos.						
  
# Dependency Inversion(DIP)
  -Los modulos de alto nivel no deben depender de los modulos de bajo nivel, ambos deben depender de abstracciones.<br/>	
  -Las abstracciones no deben depender de los detalles, los detalles deben depender de las abstracciones.<br/>	
  -Se utiliza para desacoplar modulos de software.					
    
