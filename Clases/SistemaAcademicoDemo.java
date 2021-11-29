class SistemaAcademicoDemo{
    public static void main(String[] args) {
        System.out.println("***Sistema Academico Demo");

        profesor cesarIniguez = new profesor("Cesar I", "Diseño de Circuitos");
        profesor franco = new profesor("Franco S","Analisis Matematico y TD" );

        cesarIniguez.dictarClases("Cesar I");
        estudiante jeanpiere = new estudiante("Jean", 2,'M',8.50);
        jeanpiere.matricular("JeanPiere Remache",3);
       
       

       



    }
}