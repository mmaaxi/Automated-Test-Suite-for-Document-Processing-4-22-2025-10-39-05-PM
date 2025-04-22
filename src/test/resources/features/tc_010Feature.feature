Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given El sistema está en la pantalla de carga de documentos
    When El usuario carga y procesa los documentos
    Then El sistema genera el 'Slip de salida' y guarda tanto los documentos originales como los datos extraídos en el historial de la solicitud