
1. 'PaymentService' và 'UserService' đóng vai trò là các giao diện định 
nghĩa các phương thức cần thiết để thực hiện thanh toán và lưu trữ người dùng.
2. 'PaymentServiceImpl' và 'UserServiceImpl' đóng vai trò là các lớp cụ 
thể thực hiện các chức năng của các giao diện tương ứng.
3. 'UserFacade' đóng vai trò là lớp facade, cung cấp một giao 
diện đơn giản để khách hàng tương tác với hệ thống thanh toán và lưu trữ người dùng.
4. Khách hàng muốn sử dụng chức năng thanh toán và lưu trữ người dùng thông qua lớp 'UserFacade'.
Không cần biết chi tiết về các lớp thực hiện tương ứng, khách hàng chỉ cần gọi phương thức 'makePaymentAndSaveUser' trên lớp 'UserFacade'.
Khi phương thức được gọi trên UserFacade, lớp này sẽ gọi phương thức tương ứng trên 
5. 'PaymentServiceImpl' để thực hiện thanh toán và gọi phương thức tương ứng trên 'UserServiceImpl' để lưu trữ người dùng.
6. Kết quả trả về sau khi gọi phương thức trên 'UserFacade' không phải trả về trực tiếp từ các lớp thực hiện tương ứng. 

Tuy nhiên, nếu cần, khách hàng có thể truy cập trực tiếp vào các lớp thực hiện này thông qua các giao diện đã được định nghĩa.
Như vậy, Facade Pattern giúp che giấu chi tiết triển khai của các lớp thực hiện thanh toán và lưu trữ 
người dùng và cung cấp một giao diện đơn giản để khách hàng tương tác với chúng. Điều này giúp giảm sự phức tạp của hệ 
thống và tăng tính linh hoạt trong việc thay đổi hoặc thêm mới tính năng của hệ thống.
