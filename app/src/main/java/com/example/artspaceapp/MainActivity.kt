package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
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
@Preview
@Composable
fun ArtSpacePreview() {
 ArtSpaceLayout()
}

@Composable
fun ArtSpaceLayout() {

    var counter by remember {
        mutableStateOf(1)
    }
    val paintingImage = when(counter) {
        1 -> R.drawable.vincent_van_gogh
        2 -> R.drawable.podsolnuhi
        3 -> R.drawable.nochnaya_terassa_cafe
        4 -> R.drawable.selfportrait_without_ear
        5 -> R.drawable.zvezdnaya_noch
        else -> R.drawable.vetki_mindalya
    }

    val paintingName = when(counter) {
        1 -> "Self-Portrait, 1887"
        2 -> "Sunflowers, 1888"
        3 -> "Cafe Terrace at Night."
        4 -> "Self-Portrait, 1889"
        5 -> "Starry Night, 1889"
        else -> "Almond Blossoms."
    }

    val paintingDescription = when(counter) {
        1 -> "“Better to do nothing than express yourself weakly”\n" +
                "\n" +
                "– Vincent Van Gogh\n" +
                "\n" +
                "Van Gogh searched for his destination for a long time. He started painting at the age of 27. And with all his passion he devoted himself to art. 10 years working at the limit. He was torn, shaking his physical and mental health.\n" +
                "\n" +
                "But in this fire of self-immolation, he created one masterpiece after another.\n" +
                "\n" +
                "True, no one seriously took his efforts. Many of his paintings were destroyed by those to whom he gifted them.\n" +
                "\n" +
                "Even his own mother, when moving to another city, left dozens of her son’s paintings abandoned. All of them disappeared without a trace.\n" +
                "\n" +
                "And Van Gogh himself often sold them for a penny to a junk man. He resold them for reuse to other artists.\n" +
                "\n" +
                "Despite all these losses, 3000 of his works reached us. Among them – 800 oil paintings! That is, Van Gogh created one picture every 1-2 days!\n" +
                "\n" +
                "Here are just 5 of his paintings. I took the work of the last 2 years of his life. When he became the Van Gogh we know. It was during this period that most of his masterpieces were created."
        2 -> "August 1888 For several months, Van Gogh has been living in the south of France. In the city of Arles. He came here to find bright colors. Here he created a series of paintings with “Sunflowers”.\n" +
                "\n" +
                "The London version is one of the most circulated. We meet her on bags, postcards or phone cases.\n" +
                "\n" +
                "It is surprising that ordinary flowers have become almost a symbol of all world painting. What is so unusual about them?\n" +
                "\n" +
                "The pot and background are drawn very schematically. It is not clear whether this is a table, or a distant horizon and sand.\n" +
                "\n" +
                "Flowers are not beautiful. Some of them are with ragged petals. And the majority are mutating at all.\n" +
                "\n" +
                "Please note that they are more like asters than sunflowers. Such flowers are infertile and occasionally appear among healthy ones.\n" +
                "\n" +
                "Maybe that’s why “Sunflowers” often cause conflicting feelings? On the one hand, Van Gogh wanted to show the beauty of our world. He liked the sunflowers, because they benefit the person. But on the other hand, inadvertently chooses infertile flowers.\n" +
                "\n" +
                "This is very similar to the tragedy of the artist himself. He longed to be of service to others. But the reactions of people to his paintings each time showed only one thing: his efforts were fruitless.\n" +
                "\n" +
                "He did not dare to dream that his paintings would please millions of people."
        3 -> "Van Gogh painted in Arles not only flowers, but the city itself. The Cafe Terrace at Night is one such urban landscape.\n" +
                "\n" +
                "Who was in Arles will immediately notice how the city in the paintings of Van Gogh differs from the real city.\n" +
                "\n" +
                "It was an industrial, dirty town. But with an ancient history. It was founded by the Roman emperor Constantine in the 3rd century. The Roman amphitheater, which resembles the Colosseum, has been preserved in the city center.\n" +
                "\n" +
                "This is strange, but you will not find this amphitheater in any Van Gogh painting.\n" +
                "\n" +
                "Although he captured almost every corner of Arles. But the main attraction of the city passed by!\n" +
                "\n" +
                "This is very characteristic of Van Gogh. He looked past everyday things. He saw the most unusual. He saw the soul of flowers and stones. He noticed how the stars breathe. But ignored the obvious.\n" +
                "\n" +
                "He wrote a cafe for three nights in a row. Right in the open air under the night sky. Have you ever seen an artist painting at night?\n" +
                "But this is again the unusualness of Van Gogh.\n" +
                "\n" +
                "He believed that night is richer in colors than day. And he was able to prove this “ridiculous” statement with his “Cafe Terrace”.\n" +
                "\n" +
                "There is not a single drop of black paint in the picture. Thickly applied strokes make yellow and blue even brighter. Violet and orange reflections on the pavement accompany these colors.\n" +
                "\n" +
                "This is one of the most striking and positive works of Van Gogh. Despite the fact that we have a night!"
        4 -> "The Self-Portrait with Pipe was written at Arles Hospital. The artist got there after his legendary story about a cut off ear.\n" +
                "\n" +
                "It all started with the arrival of Gauguin. Van Gogh wanted to create a workshop school, seeing Gauguin as its leader. They began to live and work under one roof.\n" +
                "\n" +
                "Van Gogh was very impractical in everyday life. The neat and collected Gauguin was annoying. Van Gogh was too emotional, argued to the point of exhaustion.\n" +
                "\n" +
                "Gauguin was self-confident and could not stand it when anyone doubted his opinion.\n" +
                "\n" +
                "Can you imagine what it was like to live for such people together?\n" +
                "\n" +
                "When Van Gogh realized that he and Gauguin could not get along together, he had a nervous breakdown. He pounced on a friend with a razor (according to Gauguin). He stopped Vincent with his menacing look.\n" +
                "\n" +
                "Then Van Gogh directed aggression on himself, cutting off his earlobe. Such a gesture may seem very strange. If you do not know one feature of Arles.\n" +
                "\n" +
                "In the already mentioned amphitheater there was a bullfight. But it was more humane than in Spain. The defeated bull had its ear cut off. Van Gogh cut off his ear, considering himself a loser.\n" +
                "\n" +
                "This story was only the last straw. Van Gogh’s nervous system by that time was greatly shaken by the frantic pace of work and constant malnutrition.\n" +
                "\n" +
                "Once he worked 4 days without sleep, having drunk 23 cups of coffee during this time! Imagine what would happen to you after such mockery of your body.\n" +
                "\n" +
                "And after the first nervous attack, Van Gogh creates his strange self-portrait.\n" +
                "\n" +
                "It is written in complementary colors. These are colors that reinforce each other. Red becomes even more red if it is next to green.\n" +
                "\n" +
                "No wonder these colors are used in traffic lights.\n" +
                "But this color enhancement is painful for eyes. Colors become too flashy. They convey cacophony in the soul of the artist."
        5 -> "Van Gogh painted the picture as a gift to his brother, whose son was born. He was named after his uncle, Vincent.\n" +
                "\n" +
                "Van Gogh wanted young parents to hang a picture above the bed. Flowering almonds mean the beginning of a new life.\n" +
                "\n" +
                "The picture is very unusual. The artist chose the angle, as if lying under a tree and looking at branches against the sky.\n" +
                "\n" +
                "The picture is decorative. After all, Van Gogh created them to decorate the housing of ordinary people with modest means. It was unlikely that he imagined that his paintings would be accessible only to the very rich.\n" +
                "\n" +
                "Six months after writing The Almond Blossoms, Van Gogh will die. According to the official version, it was suicide.\n" +
                "\n" +
                "The version of suicide is rarely disputed. After all, it made the legend of Van Gogh more dramatic. This only fueled interest in artist, and at the same time increased the value of his paintings."
        else -> "Van Gogh painted the picture as a gift to his brother, whose son was born. He was named after his uncle, Vincent.\n" +
                "\n" +
                "Van Gogh wanted young parents to hang a picture above the bed. Flowering almonds mean the beginning of a new life.\n" +
                "\n" +
                "The picture is very unusual. The artist chose the angle, as if lying under a tree and looking at branches against the sky.\n" +
                "\n" +
                "The picture is decorative. After all, Van Gogh created them to decorate the housing of ordinary people with modest means. It was unlikely that he imagined that his paintings would be accessible only to the very rich.\n" +
                "\n" +
                "Six months after writing The Almond Blossoms, Van Gogh will die. According to the official version, it was suicide.\n" +
                "\n" +
                "The version of suicide is rarely disputed. After all, it made the legend of Van Gogh more dramatic. This only fueled interest in artist, and at the same time increased the value of his paintings."
    }

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
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(400.dp)
            ) {
                PaintingWithBorders(
                    painter = painterResource(id = paintingImage)
                )
            }
            Row{
                TextWithBorders(
                    text = "Back",
                    fontFamily = FontFamily(Font(R.font.permanent_marker)),
                    backColor = Color.White,
                    modifier = Modifier
                        .clickable {
                            if(counter > 1) {
                                counter--
                            } else {
                                counter = 6
                            }
                        }
                )
                TextWithBorders(
                    text = paintingName,
                    fontFamily = FontFamily(Font(R.font.permanent_marker)),
                    backColor = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                )
                TextWithBorders(
                    text = "Next",
                    fontFamily = FontFamily(Font(R.font.permanent_marker)),
                    backColor = Color.White,
                    modifier = Modifier
                        .clickable {
                            if(counter < 6) {
                                counter++
                            } else {
                                counter = 1
                            }
                        }
                    )
            }
            TextWithBorders(
                text = paintingDescription,
                fontFamily = FontFamily(Font(R.font.oswald_variable)),
                backColor = Color.LightGray,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            )
        }
    }
}