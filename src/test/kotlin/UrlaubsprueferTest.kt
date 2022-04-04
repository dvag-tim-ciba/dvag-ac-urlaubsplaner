import com.dvag.urlaubsplaner.Rolle
import com.dvag.urlaubsplaner.Urlaubspruefer
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.time.LocalDate

class UrlaubsprueferTest {

    @Test
    fun isUrlaubValideTestErfolgreich(){
        val mutableList = mutableListOf<LocalDate>(
            LocalDate.of(2022, 1, 1),
            LocalDate.of(2022, 1,10),
            LocalDate.of(2022, 2,1),
            LocalDate.of(2022, 2, 20)
        )
        val urlaubspruefer = Urlaubspruefer()
      // MatcherAssert.assertThat(urlaubspruefer.isUrlaubValide(mutableList, Rolle.AZUBI)
    }


}