package com.example.diogoddc

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.diogoddc.databinding.ActivityMuseuBinding


class MuseuActivity : AppCompatActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityMuseuBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnAmericaMG.setOnClickListener() {
            onClickAmericaMG()
        }

        binding.btnAthleticoPR.setOnClickListener() {
            onClickAthleticoPR()
        }

        binding.btnAtleticoMG.setOnClickListener() {
            onClickAtleticoMG()
        }

        binding.btnBahia.setOnClickListener() {
            onClickBahia()
        }

        binding.btnBotafogo.setOnClickListener() {
            onClickBotafogo()
        }


        binding.btnCorinthians.setOnClickListener() {
            onClickCorinthians()
        }

        binding.btnCoritiba.setOnClickListener() {
            onClickCoritiba()
        }

        binding.btnCruzeiro.setOnClickListener() {
            onClickCruzeiro()
        }

        binding.btnCuiaba.setOnClickListener() {
            onClickCuiaba()
        }

        binding.btnFlamengo.setOnClickListener() {
            onClickFlamengo()
        }

        binding.btnFluminense.setOnClickListener() {
            onClickFluminense()
        }

        binding.btnFortaleza.setOnClickListener() {
            onClickFortaleza()
        }

        binding.btnGoias.setOnClickListener() {
            onClickGoias()
        }

        binding.btnGremio.setOnClickListener() {
            onClickGremio()
        }

        binding.btnInternacional.setOnClickListener() {
            onClickInternacional()
        }

        binding.btnPalmeiras.setOnClickListener() {
            onClickPalmeiras()
        }

        binding.btnRBBragantino.setOnClickListener() {
            onClickRBBragantino()
        }

        binding.btnSantos.setOnClickListener() {
            onClickSantos()
        }

        binding.btnSaoPaulo.setOnClickListener() {
            onClickSaoPaulo()
        }

        binding.btnVasco.setOnClickListener() {
            onClickVasco()
        }
    }

    fun onClickAmericaMG() {
        val intent = Intent(context, AmericaMGActivity::class.java)
        startActivity(intent)
    }

    fun onClickAthleticoPR() {
        val intent = Intent(context, AthleticoPRActivity::class.java)
        startActivity(intent)
    }

    fun onClickAtleticoMG() {
        val intent = Intent(context, AtleticoMGActivity::class.java)
        startActivity(intent)
    }

    fun onClickBahia() {
        val intent = Intent(context, BahiaActivity::class.java)
        startActivity(intent)
    }

    fun onClickBotafogo() {
        val intent = Intent(context, BotafogoActivity::class.java)
        startActivity(intent)
    }

    fun onClickCorinthians() {
        val intent = Intent(context, CorinthiansActivity::class.java)
        startActivity(intent)
    }

    fun onClickCoritiba() {
        val intent = Intent(context, CoritibaActivity::class.java)
        startActivity(intent)
    }

    fun onClickCruzeiro() {
        val intent = Intent(context, CruzeiroActivity::class.java)
        startActivity(intent)
    }

    fun onClickCuiaba() {
        val intent = Intent(context, CuiabaActivity::class.java)
        startActivity(intent)
    }

    fun onClickFlamengo() {
        val intent = Intent(context, FlamengoActivity::class.java)
        startActivity(intent)
    }

    fun onClickFluminense() {
        val intent = Intent(context, FluminenseActivity::class.java)
        startActivity(intent)
    }

    fun onClickFortaleza() {
        val intent = Intent(context, FortalezaActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoias() {
        val intent = Intent(context, GoiasActivity::class.java)
        startActivity(intent)
    }

    fun onClickGremio() {
        val intent = Intent(context, GremioActivity::class.java)
        startActivity(intent)
    }

    fun onClickInternacional() {
        val intent = Intent(context, InternacionalActivity::class.java)
        startActivity(intent)
    }

    fun onClickPalmeiras() {
        val intent = Intent(context, PalmeirasActivity::class.java)
        startActivity(intent)
    }

    fun onClickRBBragantino() {
        val intent = Intent(context, RBBragantinoActivity::class.java)
        startActivity(intent)
    }

    fun onClickSantos() {
        val intent = Intent(context, SantosActivity::class.java)
        startActivity(intent)
    }

    fun onClickSaoPaulo() {
        val intent = Intent(context, SaoPauloActivity::class.java)
        startActivity(intent)
    }

    fun onClickVasco() {
        val intent = Intent(context, VascoActivity::class.java)
        startActivity(intent)
    }
}
