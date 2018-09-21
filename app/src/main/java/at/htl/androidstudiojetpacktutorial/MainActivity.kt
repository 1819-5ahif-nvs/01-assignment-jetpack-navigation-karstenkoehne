package at.htl.androidstudiojetpacktutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    lateinit var drawer : DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val host = supportFragmentManager.findFragmentById(R.id.myfragment) as NavHostFragment? ?: return
        val navController = host.navController

        drawer = findViewById(R.id.container)
        NavigationUI.setupActionBarWithNavController(this,navController,drawer)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(drawer, Navigation.findNavController(this,R.id.myfragment))
    }
}
