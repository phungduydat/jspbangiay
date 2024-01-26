<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!-- header -->
        <jsp:include page="Menu.jsp"></jsp:include>
            <!-- end header -->

            <main role="main">
                <!-- Block content - Đục lỗ trên giao diện bố cục chung, đặt tên là `content` -->
                <div class="container mt-4">
                    <form class="needs-validation" name="frmthanhtoan" method="post"
                          action="#">
                        <input type="hidden" name="kh_tendangnhap" value="dnpcuong">

                        <div class="py-5 text-center">
                            <i class="fa fa-credit-card fa-4x" aria-hidden="true"></i>
                            <h2>Thanh toán</h2>
                            <p class="lead">Vui lòng kiểm tra thông tin Khách hàng, thông tin Giỏ hàng trước khi Đặt hàng.</p>
                        </div>

                        <div class="row">
                            <div class="col-md-4 order-md-2 mb-4">
                                <h4 class="d-flex justify-content-between align-items-center mb-3">
                                    <span class="text-muted">Giỏ hàng</span>
                                    <span class="badge badge-secondary badge-pill">2</span>
                                </h4>
                                <!-- Shopping cart table -->
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th scope="col" class="border-0 bg-light">
                                                    <div class="p-2 px-3 text-uppercase">Sản Phẩm</div>
                                                </th>
                                                <th scope="col" class="border-0 bg-light">
                                                    <div class="py-2 text-uppercase">Đơn Giá</div>
                                                </th>
                                                <th scope="col" class="border-0 bg-light">
                                                    <div class="py-2 text-uppercase">Số Lượng</div>
                                                </th>

                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${listP}" var="o">
                                            <tr>
                                                <th scope="row">
                                                    <div class="p-2">
                                                        <img src="${o.image}" alt="" width="70" class="img-fluid rounded shadow-sm">
                                                        <div class="ml-3 d-inline-block align-middle">
                                                            <h5 class="mb-0"> <a href="#" class="text-dark d-inline-block"${o.name}</a></h5><span class="text-muted font-weight-normal font-italic"></span>
                                                        </div>
                                                    </div>
                                                </th>
                                                <td class="align-middle"><strong>${o.price} VND</strong></td>
                                                <!--                                                    <td class="align-middle">
                                                                                                        <a href="#"><button class="btnSub">-</button></a> 
                                                                                                        <strong>1</strong>
                                                                                                        <a href="#"><button class="btnAdd">+</button></a>
                                                                                                    </td>-->
                                                <td class="align-middle">
                                                    <strong>${o.amount}</strong>
                                                </td>
                                            </tr> 
                                        </c:forEach>
                                    <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Tổng thanh toán</strong>
                                        <h5 class="font-weight-bold">${pay} VND</h5>
                                    </li>
                                    </tbody>
                                </table>
                            </div>
                            </ul>


                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="Mã khuyến mãi">
                                <div class="input-group-append">
                                    <button type="submit" class="btn btn-secondary">Xác nhận</button>
                                </div>
                            </div>

                        </div>
                        <div class="col-md-8 order-md-1">
                            <h4 class="mb-3">Thông tin khách hàng</h4>

                            <div class="row">
                                <div class="col-md-12">
                                    <label>Name</label>
                                    <input name="ten1" type="text" class="form-control" required>
                                </div>
                                <div class="col-md-12">
                                    <label >Giới tính</label>
                                    <input type="text" class="form-control" name="gioitinh1" required>
                                </div>
                                <div class="col-md-12">
                                    <label >Địa chỉ</label>
                                    <input type="text" class="form-control" name="diachi1"
                                           required>
                                </div>
                                <div class="col-md-12">
                                    <label>Điện thoại</label>
                                    <input type="text" class="form-control" name="dienthoai1"
                                           required>
                                </div>
                                <div class="col-md-12">
                                    <label>Email</label>
                                    <input type="text" class="form-control" name="email1"
                                           required>
                                </div>
                                <div class="col-md-12">
                                    <label>Ngày sinh</label>
                                    <input type="text" class="form-control" name="ngaysinh1" 
                                           required>
                                </div>
                                <div class="col-md-12">
                                    <label>CMND</label>
                                    <input type="text" class="form-control" name="cmnd1" required>
                                </div>
                            </div>

                            <h4 class="mb-3">Hình thức thanh toán</h4>

                            <div class="d-block my-3">
                                <div class="custom-control custom-radio">
                                    <input id="httt-1" name="httt_ma" type="radio" class="custom-control-input" required=""
                                           value="1">
                                    <label class="custom-control-label" for="httt-1">Tiền mặt</label>
                                </div>
                                <div class="custom-control custom-radio">
                                    <input id="httt-2" name="httt_ma" type="radio" class="custom-control-input" required=""
                                           value="2">
                                    <label class="custom-control-label" for="httt-2">Chuyển khoản</label>
                                </div>
                                <div class="custom-control custom-radio">
                                    <input id="httt-3" name="httt_ma" type="radio" class="custom-control-input" required=""
                                           value="3">
                                    <label class="custom-control-label" for="httt-3">Ship COD</label>
                                </div>
                            </div>
                            <hr class="mb-4">
                            <ul class="btn btn-dark rounded-pill btn-block">
                                <li class="nav-item">
                                    <a class="nav-link text-white " href="getdatacheckout">Manager Account</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </form>

            </div>
            <!-- End block content -->
        </main>

        <!-- footer -->
        <jsp:include page="Footer.jsp"></jsp:include>

        <!-- end footer -->

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="../vendor/jquery/jquery.min.js"></script>
        <script src="../vendor/popperjs/popper.min.js"></script>
        <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

        <!-- Custom script - Các file js do mình tự viết -->
        <script src="../assets/js/app.js"></script>

    </body>

</html>