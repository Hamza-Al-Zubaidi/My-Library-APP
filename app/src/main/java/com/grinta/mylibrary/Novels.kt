package com.grinta.mylibrary

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment


class Novels: Fragment() {
    @SuppressLint("CommitPrefEdits")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view2 = inflater.inflate(R.layout.fragment_novels, container, false)
        val HarryPotter: TextView = view2.findViewById(R.id.HarryPotterTextViewID)
        val TheAlchimest: TextView = view2.findViewById(R.id.thealchimestTextViewID)
        val InvisibleMan: TextView = view2.findViewById(R.id.invisiblemanTextViewID)
        val Alice: TextView = view2.findViewById(R.id.aliceTextViewID)
        val RulesofLove: TextView = view2.findViewById(R.id.rulesofloveTextViewID)
        val DateBook: TextView = view2.findViewById(R.id.DateBookTextViewID)
        val DaVinciCode: TextView = view2.findViewById(R.id.davinciTextViewID)
        val HarryPotterImage: ImageView = view2.findViewById(R.id.HarryPotterImage)
        val TheAlchimestImage: ImageView = view2.findViewById(R.id.TheAlchimestImage1)
        val InvisiblManImage: ImageView = view2.findViewById(R.id.InvisibleManImage1)
        val AliceImage: ImageView = view2.findViewById(R.id.AliceImage1)
        val RulesofLoveImage: ImageView = view2.findViewById(R.id.rulesofloveImage1)
        val DateBookImage: ImageView = view2.findViewById(R.id.datebookImage1)
        val DaVinciCodeImage: ImageView = view2.findViewById(R.id.DavinciImage1)
        var HarryPotterFav: ImageView = view2.findViewById(R.id.HarryPotterFav)
        var TheAlchimestFav: ImageView = view2.findViewById(R.id.TheAlchimestFav)
        var InvisibleManFav: ImageView = view2.findViewById(R.id.InvisibleManFav)
        var AlicFav: ImageView = view2.findViewById(R.id.AliceFav)
        var RulesofLoveFav: ImageView = view2.findViewById(R.id.RulesofLoveFav)
        var DateBookFav: ImageView = view2.findViewById(R.id.datebookFav)
        var DaVinciCodeFav: ImageView = view2.findViewById(R.id.DaVinciFav)
        var HarryPotterFavFlag: Int = 0
        var TheAlchimestFavFlag: Int = 0
        var InvisibleManFavFlag: Int = 0
        var AliceFavFlag: Int = 0
        var RulesofLoveFavFlag: Int = 0
        var DateBookFavFlag: Int = 0
        var DaVinciFavFlag: Int = 0

        HarryPotter.setOnClickListener {
            sendMessagetoPDF(1)
        }
        HarryPotterImage.setOnClickListener {
            sendMessagetoPDF(1)
        }
        HarryPotterFav.setOnClickListener {
            if (HarryPotterFavFlag == 0) {
                checkFavourite(HarryPotter, HarryPotterFav, HarryPotterFavFlag)
                HarryPotterFavFlag = 1
            }
            else {
                checkFavourite(HarryPotter, HarryPotterFav, HarryPotterFavFlag)
                HarryPotterFavFlag = 0
            }
        }

        TheAlchimest.setOnClickListener {
            sendMessagetoPDF(2)
        }
        TheAlchimestImage.setOnClickListener {
            sendMessagetoPDF(2)
        }
        TheAlchimestFav.setOnClickListener {
            if (TheAlchimestFavFlag == 0) {
                checkFavourite(TheAlchimest, TheAlchimestFav, TheAlchimestFavFlag)
                TheAlchimestFavFlag = 1
            }
            else {
                checkFavourite(TheAlchimest, TheAlchimestFav, TheAlchimestFavFlag)
                TheAlchimestFavFlag = 0
            }
        }

        InvisibleMan.setOnClickListener {
            sendMessagetoPDF(3)
        }
        InvisiblManImage.setOnClickListener {
            sendMessagetoPDF(3)
        }
        InvisibleManFav.setOnClickListener {
            if (InvisibleManFavFlag == 0) {
                checkFavourite(InvisibleMan, InvisibleManFav, InvisibleManFavFlag)
                InvisibleManFavFlag = 1
            }
            else {
                checkFavourite(InvisibleMan, InvisibleManFav, InvisibleManFavFlag)
                InvisibleManFavFlag = 0
            }
        }

        Alice.setOnClickListener {
            sendMessagetoPDF(4)
        }
        AliceImage.setOnClickListener {
            sendMessagetoPDF(4)
        }
        AlicFav.setOnClickListener {
            if (AliceFavFlag == 0) {
                checkFavourite(Alice, AlicFav, AliceFavFlag)
                AliceFavFlag = 1
            }
            else {
                checkFavourite(Alice, AlicFav, AliceFavFlag)
                AliceFavFlag = 0
            }
        }

        RulesofLove.setOnClickListener {
            sendMessagetoPDF(5)
        }
        RulesofLoveImage.setOnClickListener {
            sendMessagetoPDF(5)
        }
        RulesofLoveFav.setOnClickListener {
            if (RulesofLoveFavFlag == 0) {
                checkFavourite(RulesofLove, RulesofLoveFav, RulesofLoveFavFlag)
                RulesofLoveFavFlag = 1
            }
            else {
                checkFavourite(RulesofLove, RulesofLoveFav, RulesofLoveFavFlag)
                RulesofLoveFavFlag = 0
            }
        }

        DateBook.setOnClickListener {
            sendMessagetoPDF(6)
        }
        DateBookImage.setOnClickListener {
            sendMessagetoPDF(6)
        }
        DateBookFav.setOnClickListener {
            if (DateBookFavFlag == 0) {
                checkFavourite(DateBook, DateBookFav, DateBookFavFlag)
                DateBookFavFlag = 1
            }
            else {
                checkFavourite(DateBook, DateBookFav, DateBookFavFlag)
                DateBookFavFlag = 0
            }
        }

        DaVinciCode.setOnClickListener {
            sendMessagetoPDF(7)
        }
        DaVinciCodeImage.setOnClickListener {
            sendMessagetoPDF(7)
        }
        DaVinciCodeFav.setOnClickListener {
            if (DaVinciFavFlag == 0) {
                checkFavourite(DaVinciCode, DaVinciCodeFav, DaVinciFavFlag)
                DaVinciFavFlag = 1
            }
            else {
                checkFavourite(DaVinciCode, DaVinciCodeFav, DaVinciFavFlag)
                DaVinciFavFlag = 0
            }
        }
        return view2
    }

    fun checkFavourite(BookName: TextView, FavouriteImage: ImageView, favFlag: Int) {

        if (favFlag == 0) {
            FavouriteImage.setImageDrawable(ContextCompat.getDrawable(requireView().context, R.drawable.heart))
            Toast.makeText(requireView().context, "Added to favourite list", Toast.LENGTH_LONG).show()

            val values = ContentValues()
            values.put(LibraryProvider.NAME, BookName.text.toString())
            context?.contentResolver?.insert(LibraryProvider.CONTENT_URI, values)
        }
        else {
            FavouriteImage.setImageDrawable(ContextCompat.getDrawable(requireView().context, R.drawable.emptyheart))
            Toast.makeText(requireView().context, "Removed from favourite list", Toast.LENGTH_LONG).show()

            val selection = "name = \"" + BookName.text.toString() + "\""

            val rowsDeleted = context?.contentResolver?.delete(
                LibraryProvider.CONTENT_URI,
                selection, null
            )
        }
    }

    fun sendMessagetoPDF(code: Int) {
        val PDFIntent = Intent(context, PDFViewer::class.java)
        PDFIntent.putExtra("Flag", code)
        startActivity(PDFIntent)
    }
}