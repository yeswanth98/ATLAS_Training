package FacadePattern;

class BankFacade {
    private FdService fdService;

    public BankFacade() {
        this.fdService = new FdService();
    }

    public void getFdDetails(String accountNo) {
        fdService.getFdServiceDetails(accountNo);
    }
}