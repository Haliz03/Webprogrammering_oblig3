package oblig3.webprog;

public class Billett {
     private String film;
        private int antall;
        private String fornavn;
        private String etternavn;
        private String telefonnr;
        private String email;

        // Konstruktører: Konstruktører er som
        // oppskrifter for å lage nye ting i programmering.
        // De forteller programmet hvordan det skal starte når
        // det lager et nytt objekt.
        public Billett(String film, int antall, String fornavn, String etternavn, String telefonnr, String email) {
            this.film = film;
            this.antall = antall;
            this.fornavn = fornavn;
            this.etternavn = etternavn;
            this.telefonnr = telefonnr;
            this.email = email;
        }

        // Getters: Getters er metoder i programmering som brukes til å få tilgang til (hente) verdien av en privat egenskap i en klasse.
        public Billett() {}

        //Getters
        public String getFilm () {
            return film;
        }

        public int getAntall () {
            return antall;
        }

        public String getFornavn () {
            return fornavn;
        }

        public String getEtternavn () {
            return etternavn;
        }

        public String getTelefonnr () {
            return telefonnr;
        }

        public String getEmail () {
            return email;
        }

        //Setters: Setters er metoder i programmering som brukes til å endre (sette) verdien av en privat egenskap i en klasse. De tillater ekstern kode å oppdatere verdien til en variabel på en kontrollert måte.

        public void setFilm (String film){
            this.film = film;
        }

        public void setAntall ( int antall){
            this.antall = antall;
        }

        public void setFornavn (String fornavn){
            this.fornavn = fornavn;
        }

        public void setEtternavn (String etternavn){
            this.etternavn = etternavn;
        }

        public void setTelefonnr (String telefonnr){
            this.telefonnr = telefonnr;
        }

        public void setEmail (String email){
            this.email = email;
        }
    }


