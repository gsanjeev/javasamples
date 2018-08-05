import com.laxtech.service.spi.StudentServiceInterface;
import com.laxtech.studentprovider2.StudentServiceProvider2;

module studentprovider2 {
    requires service;
    provides StudentServiceInterface with StudentServiceProvider2;
}