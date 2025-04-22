Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir archivo PDF/DOCX y mostrar vista previa
    Given El usuario está en la página de subida de archivos
    When El usuario selecciona un archivo en formato PDF/DOCX dentro del límite de 50 MB
    Then El archivo se carga correctamente y se muestra la vista previa con el nombre, tamaño y tipo del archivo