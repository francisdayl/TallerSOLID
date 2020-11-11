# TallerSOLID

1.En base al principio “Single Responsability”, se procedió a crear la clase padre “Postre” ya que las clases Helado y Pastel contienen atributos y métodos similares. Lo único que varían son sus precios parciales. De allí la implementación respectiva de constructores en la clase padre para ser usadas en las hijas y así, se cumple el que una clase solo realiza un funcionamiento en específico.

2. En base al principio Abierto - Cerrado, se procedió a eliminar la clase operacionesaderezo porque incorporaba funciones para cada tipo de postre, por lo cual si deseamos incorporar nuevos postres se tenia que añadir esas funcionalidades para cada tipo de postre resultando en poca escalabilidad. Debido a esto se integraron esas funciones en la clase padre Postres para que todos los postres puedan añadir y quitar aderezos sin la necesidad de tener que escribir más código para cada postre nuevo incorporado al sistema.
