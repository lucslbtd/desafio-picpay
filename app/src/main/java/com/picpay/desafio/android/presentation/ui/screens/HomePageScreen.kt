import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.picpay.desafio.android.presentation.viewmodel.HomePageViewModel

@Composable
fun HomePageScreen(viewModel: HomePageViewModel = hiltViewModel()) {
    val users by viewModel.users.collectAsState()

}
