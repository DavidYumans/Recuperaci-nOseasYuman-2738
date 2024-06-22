public class Catedrático {

        private String nombre;
        private String correo;
        private String password;
        private String carnet;

        public Catedrático(){
            //vacio
        }
        public Catedrático(String nombre){
            this.nombre=nombre;
        }

        public Catedrático(String nombre, String correo, String password, String carnet){
            this.nombre=nombre;
            this.correo=correo;
            this.password=password;
            this.carnet=carnet;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getPassword() {
        return password;
        }

        public void setPassword(String password) {
        this.password = password;
        }

        public String getCarnet() {
        return carnet;
        }

        public void setCarnet(String carnet) {
        this.carnet = carnet;
        }
}
