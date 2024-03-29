package xml

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.courierapp.R
import com.example.courierapp.data.OnboardingData
import com.example.courierapp.ui.theme.Black
import com.example.courierapp.ui.theme.BlueMain
import com.example.courierapp.ui.theme.GrayText
import java.util.ArrayList

@Composable
fun Onboarding(navController: NavController) {
    var page by remember {
        mutableStateOf(0)
    }
    var pages = ArrayList<OnboardingData>()
    pages.add(
        OnboardingData(
            image = R.drawable.onboarding1,
            text1 = "Quick Delivery At Your Doorstep",
            text2 = "Enjoy quick pick-up and delivery to your destination",
            button1 = "Skip",
            button2 = "Next"
        )
    )
    pages.add(
        OnboardingData(
            image = R.drawable.onboarding2,
            text1 = "Flexible Payment",
            text2 = "Different modes of payment either before and after delivery without stress",
            button1 = "Skip",
            button2 = "Next"
        )
    )
    pages.add(
        OnboardingData(
            image = R.drawable.onboarding3,
            text1 = "Real-time Tracking",
            text2 = "Track your packages/items from the comfort of your home till final destination",
            button1 = "Sign Up",
            button2 = "Sign In"
        )
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .background(BlueMain),
        contentAlignment = Alignment.TopCenter){
        Image(painter = painterResource(id = pages[page].image), contentDescription = null,
            modifier = Modifier.fillMaxHeight(0.9f),
            contentScale = ContentScale.Crop)
    }
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center){
        Column(modifier = Modifier
            .fillMaxWidth(0.85f)
            .fillMaxHeight(0.9f)) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = null,
                modifier = Modifier.height(48.dp),
                contentScale = ContentScale.Crop)
        }
    }
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter){
        Column(modifier = Modifier.fillMaxWidth(0.85f),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Text(
                text = pages[page].text1,
                color = Color.White,
                fontWeight = FontWeight.Black,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                maxLines = 2,
                lineHeight = 28.sp
            )
            Text(
                text = pages[page].text2,
                color = GrayText,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                maxLines = 2,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.height(60.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                OutlinedButton(
                    onClick = { navController.navigate("signup") },
                    modifier = Modifier
                        .height(52.dp)
                        .width(144.dp)
                        .border(2.dp, Color.White, RoundedCornerShape(41.dp)),
                    shape = RoundedCornerShape(41.dp),
                    colors = ButtonDefaults.outlinedButtonColors(

                    )
                ) {
                    Text(
                        text = pages[page].button1,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                    )
                }
                Button(
                    onClick = { if (page == 2) navController.navigate("signup") else page += 1 },
                    modifier = Modifier
                        .height(52.dp)
                        .width(144.dp),
                    shape = RoundedCornerShape(41.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        
                        Text(
                            text = pages[page].button2,
                            color = Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center,
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.arrowsbutton),
                            contentDescription = null,
                            tint = Black,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(90.dp))
        }
    }


}