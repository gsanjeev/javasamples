module studentprovider1 {
    requires service;
    provides com.laxtech.service.spi.StudentServiceInterface with com.laxtech.studentprovider1.StudentServiceProvider1;
}