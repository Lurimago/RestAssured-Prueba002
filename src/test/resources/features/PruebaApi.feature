#language: es
@Regresion @MVP001
Característica: Consulta un servicio

  @test002
  Escenario: Consulta un servicio
    Dado la url "https://jsonplaceholder.typicode.com" del servicio
    Cuando hago la consulta de los articulos
    Entonces imprimo los articulos