package com.example.courierapp.ui.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.courierapp.R
import com.example.courierapp.ui.theme.Black
import com.example.courierapp.ui.theme.BlackIcons
import com.example.courierapp.ui.theme.BlueMain
import com.example.courierapp.ui.theme.GrayLight
import com.example.courierapp.ui.theme.GrayMain

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(text : String): String {
    var value by remember{
        mutableStateOf("")
    }
    OutlinedTextField(
        value = value,
        onValueChange = { value = it },
        modifier = Modifier
            .fillMaxWidth()
            .height(53.dp)
        ,
        shape = RoundedCornerShape(32.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = GrayMain,
            unfocusedBorderColor = GrayMain,
            containerColor = Color.White
        ),
        placeholder = {
            Row {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = text,
                    color = GrayLight,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    lineHeight = 16.sp
                )
            }

        }
    )
    return value
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyPassTextField(text : String): String {
    var value by remember{
        mutableStateOf("")
    }
    var isvisible by remember {
        mutableStateOf(false)
    }
    OutlinedTextField(
        value = value,
        onValueChange = { value = it },
        modifier = Modifier
            .fillMaxWidth()
            .height(53.dp)
        ,
        shape = RoundedCornerShape(32.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = GrayMain,
            unfocusedBorderColor = GrayMain,
            containerColor = Color.White
        ),
        placeholder = {
            Row {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = text,
                    color = GrayLight,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    lineHeight = 16.sp
                )
            }

        },
        trailingIcon = {
            Row {
                IconButton(onClick = { isvisible = !isvisible }) {
                    Icon(
                        painter = painterResource(id = R.drawable.eyepassword),
                        contentDescription = null,
                        tint = if (value.equals("")) GrayLight else BlackIcons
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
            }

        },
        visualTransformation = if (!isvisible) PasswordVisualTransformation('*') else VisualTransformation.None
    )
    return value
}
@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCodeTextField(): String {
    var value by remember{
        mutableStateOf("")
    }
    Box(contentAlignment = Alignment.Center){
        OutlinedTextField(
            value = value,
            onValueChange = {
                value = it
                value = value.get(0).toString()
                            },
            modifier = Modifier
                .width(42.dp)
                .height(51.dp)
            ,
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = BlueMain,
                unfocusedBorderColor = if (value.equals("")) GrayMain else BlueMain,
                containerColor = Color.White
            ),
            textStyle = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Normal,
                color = Color.White,
                ),

        )
        Text(
            text = value,
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp,
        )
    }

    return value
}