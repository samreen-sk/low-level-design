import model.bankAccountModel;
import repository.accountRepository;
import service.accountService;

public class main{
    public static void main(String[] args) {
        accountRepository repository = new accountRepository();
        accountService service = new accountService(repository);
        service.createSavingsAccount("AC001", "ABC", 5000);
        service.deposit("AC001", 1000);
        service.withdraw("AC001",700);

        bankAccountModel savings = service.getAccount("AC001");
        System.out.println(savings.getBalance());

    }
}