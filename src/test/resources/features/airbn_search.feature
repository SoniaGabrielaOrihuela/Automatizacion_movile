Feature: Busqueda en Airbnb
  @BuscarAirbnb
  Scenario: Buscar texto por filtro en Airbnb

    Given Valido la pagina de Airnbn
    When Ingreso el texto "Cancun" en el campo de busqueda
    And Hago clic en el boton buscar
    Then muestra el texto "¿En que fechas viajas?"

   # Examples:
      #| PRODUCTO                  | UNIDADES |
      #| Sauce Labs Backpack       | 1        |
      #| Sauce Labs Bolt - T-Shirt | 1        |
      #| Sauce Labs Bike Light     | 2        |