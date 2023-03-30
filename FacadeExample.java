interface PaymentService {
    void pay(double amount);
}

// Lớp thực hiện thanh toán
class PaymentServiceImpl implements PaymentService {
    public void pay(double amount) {
        System.out.println("Payment success: " + amount);
    }
}

// Giao diện cho lưu trữ người dùng
interface UserService {
    void saveUser(String name, String email);
}

// Lớp thực hiện lưu trữ người dùng
class UserServiceImpl implements UserService {
    public void saveUser(String name, String email) {
        System.out.println("Saved: " + name + ", " + email);
    }
}

// Lớp Facade đơn giản để sử dụng thanh toán và lưu trữ người dùng
class UserFacade {
    private PaymentService paymentService;
    private UserService userService;

    public UserFacade() {
        paymentService = new PaymentServiceImpl();
        userService = new UserServiceImpl();
    }

    public void makePaymentAndSaveUser(String name, String email, double amount) {
        paymentService.pay(amount);
        userService.saveUser(name, email);
    }
}

// Sử dụng Facade để thanh toán và lưu trữ người dùng
public class FacadeExample {
    public static void main(String[] args) {
        UserFacade userFacade = new UserFacade();
        userFacade.makePaymentAndSaveUser("Nguyen Nam", "Nam@example.com", 100.00);
    }
}
