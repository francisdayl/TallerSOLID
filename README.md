﻿# TallerSOLID

1.En base al principio “Single Responsability”, se procedió a crear la clase padre “Postre” ya que las clases Helado y Pastel contienen atributos y métodos similares. Lo único que varían son sus precios parciales. De allí la implementación respectiva de constructores en la clase padre para ser usadas en las hijas y así, se cumple el que una clase solo realiza un funcionamiento en específico.

2. En base al principio Abierto - Cerrado, se procedió a eliminar la clase operacionesaderezo porque incorporaba funciones para cada tipo de postre, por lo cual si deseamos incorporar nuevos postres se tenia que añadir esas funcionalidades para cada tipo de postre resultando en poca escalabilidad. Debido a esto se integraron esas funciones en la clase padre Postres para que todos los postres puedan añadir y quitar aderezos sin la necesidad de tener que escribir más código para cada postre nuevo incorporado al sistema.

3. En base al principio Single-Responsability, la clase postres solo debe responsabilisarse se guardar la informacion de los postres que se van a generar. Cualquier
operacion que involucre la informacion de esta clase debe estar separada en caso de que se lleguen a realizar cambios en la formula

4. En base al principio de Sustitución de Liskov, la clase Aderezos era muy estática. Ahora se cambió por una clase dinámica y con clases que heredan los metodos de está, las cuales representan los tipos de aderezos disponibles. 

5. En base al principio de Sustitucion de Liskov, se cambio la Herencia con respecto a las clases en el paquete "Leche", dado que el metodo "usarPastel()" de la clase padre "LecheEntera" resultaba sobrante en la clase hija "LecheDeslactosada", al tener metodos de mas rompe el principio de Sustitucion de Liskov al no poder sustituir las clases "LecheEntera" con "LecheDeslactosada"