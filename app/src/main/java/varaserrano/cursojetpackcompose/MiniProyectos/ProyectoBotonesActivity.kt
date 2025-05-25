package varaserrano.cursojetpackcompose.MiniProyectos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import varaserrano.cursojetpackcompose.ui.theme.CursoJetpackComposeTheme
import varaserrano.cursojetpackcompose.MiniProyectos.Botones.*

class ProyectoBotonesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember { mutableStateOf(false) }
            CursoJetpackComposeTheme (
                darkTheme = darkMode.value
            ){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content(darkMode = darkMode)
                }
            }
        }
    }
}


///@Preview(showBackground = true)
@Composable
fun Content(darkMode: MutableState<Boolean>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotonNormal()
        Space()
        BotonNormal2()
        Space()
        BotonTexto()
        Space()
        BotonOutline()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()
        BotonDarkMode(darkMode = darkMode)
        Space()
        BotonFlotante()
    }
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}