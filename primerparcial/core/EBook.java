import java.io.File;

public class EBook {
    private String text;



    public String Lenguage() {
        public abstract String Translate();
    }



    public boolean verifyAccess(String token) {
        var access = false;
        System.out.println("Verificando acceso");

        //Sentencias para verificar el token
        //...

        return access;
    }

    private Exportable exportable;

    public Exportador(Exportable exportable){
        this.exportable = exportable
    }

    public String exportar(){
        return exportable.exportar();
    }

    public void screenAdapter(Screen screen) {
        ScreenText screenText = new ScreenText();
        //1. Generar formato intermedio
        //Sentencias para transformar a código intermedio.
        //...

        //2. Calcular características texto
        if(!(screen instanceof BrailleDevice)) {
            screenText.calcTextFeatures(screen);
        }
        //3. Enviar a pantalla
        screenText.render(screen);
    }

    public void print(Printer printer) {
        printer.print(text);
    }
}

