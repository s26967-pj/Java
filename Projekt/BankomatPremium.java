class BankomatPremium extends Bankomat {
    public BankomatPremium() {
        super();
    }

    @Override
    protected void uruchom() {
        super.uruchom();
        // Dodatkowe funkcjonalności dla Bankomatu Premium
        if (getKWOTA_DOSTEPNA_DO_WYPLATY() != 0) {
            System.out.println("Dziękujemy za skorzystanie z Bankomatu !");
        }
    }
}
