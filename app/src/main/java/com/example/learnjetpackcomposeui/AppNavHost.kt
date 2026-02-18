package com.example.learnjetpackcomposeui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.learnjetpackcomposeui.UiDesigns.FoodMenuApp.HomeScreen
import com.example.learnjetpackcomposeui.UiDesigns.SimpleLoginRegisterApp.LoginScreen
import com.example.learnjetpackcomposeui.UiDesigns.SimpleLoginRegisterApp.RegisterScreen
import com.example.learnjetpackcomposeui.UiDesigns.SimpleLoginRegisterApp.ResetPasswordScreen
import com.example.learnjetpackcomposeui.UiDesigns.SimpleLoginRegisterApp.StartScreen
import com.example.learnjetpackcomposeui.UiDesigns.SimpleLoginRegisterApp.VerifyCodeScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = "start"
    ) {

        // --- Start Screen ---
        composable("start") {
            StartScreen(navController = navController)
        }

        // --- Login Screen ---
        composable("login") {
            LoginScreen(navController = navController)
        }

        // --- Register Screen ---
        composable("Signup") {
            RegisterScreen(navController = navController)
        }

        // --- ResetPasswordScreen ---
        composable("ResetPasswordScreen") {
            ResetPasswordScreen(navController = navController)
        }

        // --- VerifyCodeScreen ---
        composable("VerifyCodeScreen") {
            VerifyCodeScreen(navController = navController)
        }

        // --- Home Screen ---
        composable("home") {
            HomeScreen()
        }
    }
}
