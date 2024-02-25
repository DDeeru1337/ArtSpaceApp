package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                    ArtSpaceLayout(

                    )
            }
        }
    }
}

@Composable
fun TextWithBorders(
    text: String,
    fontFamily: FontFamily,
    backColor: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(backColor)
            .border(4.dp, Color.Black)
    ) {
        Text(
            text = text,
            color = Color.Black,
            fontFamily = fontFamily,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}

@Composable
fun PaintingWithBorders(
    painter: Painter
) {
    Box(
        modifier = Modifier
            .padding(24.dp)
            .border(12.dp, Color.DarkGray)
            .background(Color.White)
            .padding(16.dp)

    ) {
        Image(
            painter = painter,
            contentDescription = null
        )
    }
}

@Composable
fun ArtSpaceLayout() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.zvezdnaya_noch),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.8f
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            TextWithBorders(
                text = "Vincent van Gogh",
                fontFamily = FontFamily(Font(R.font.permanent_marker)),
                backColor = Color.White
                )
            PaintingWithBorders(
                painter = painterResource(id = R.drawable.vincent_van_gogh)
            )
            TextWithBorders(
                text = "Self-Portrait, 1887",
                fontFamily = FontFamily(Font(R.font.permanent_marker)),
                backColor = Color.White
            )
            TextWithBorders(
                text = "Van Gogh created more than 43 self-portraits between 1885 and 1889. " +
                        "They were usually completed in series, such as those painted in Paris in mid-1887, and continued until shortly before his death. " +
                        "Generally the portraits were studies, created during periods when he was reluctant to mix with others, or when he lacked models, and so painted himself.",
                fontFamily = FontFamily(Font(R.font.oswald_variable)),
                backColor = Color.LightGray,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            )
        }
    }
}