import com.dvag.urlaubsplaner.Jahresurlaub
import com.dvag.urlaubsplaner.Rolle
import com.dvag.urlaubsplaner.Urlaubspruefer
import org.junit.Test
import org.junit.Assert
import java.time.LocalDate

class UrlaubsprueferTest {

    val urlaubspruefer = Urlaubspruefer()

    @Test
    fun isUrlaubValideTestTrue(){
        val mutableList = mutableListOf<Jahresurlaub>(
            Jahresurlaub(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 10)),
            Jahresurlaub(LocalDate.of(2022, 2, 1), LocalDate.of(2022, 2, 15)),
            Jahresurlaub(LocalDate.of(2022, 3, 1), LocalDate.of(2022, 3, 5))
        )
        Assert.assertTrue(urlaubspruefer.isUrlaubValide(mutableList, Rolle.AZUBI))
    }

    @Test
    fun isUrlaubValideTestFalse(){
        val mutableList = mutableListOf<Jahresurlaub>(
            Jahresurlaub(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 10)),
            Jahresurlaub(LocalDate.of(2022, 2, 1), LocalDate.of(2022, 2, 15)),
            Jahresurlaub(LocalDate.of(2022, 3, 1), LocalDate.of(2022, 3, 5))
        )
        Assert.assertTrue(urlaubspruefer.isUrlaubValide(mutableList, Rolle.AZUBI))
    }
}

