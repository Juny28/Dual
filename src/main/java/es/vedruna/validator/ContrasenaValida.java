package es.vedruna.validator;

public class ContrasenaValida {
        /*
          Verifica si una contraseña es válida.
          Reglas: al menos 8 caracteres, un número y una letra mayúscula.
         */
        public static boolean isValidPassword(String password) {
            return password != null &&
                    password.length() >= 8 &&
                    password.matches(".*\\d.*") &&
                    password.matches(".*[A-Z].*");
        }

        /*
          Verifica si un email tiene un formato básico válido.
         */
        public static boolean isValidEmail(String email) {
            return email != null &&
                    email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
        }


}
