package com.example.streak.technospandan.utils;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.EventCardModel;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CEventCardsUtils {

    public static Collection<EventCardModel> generateSportCards() {
        List<EventCardModel> eventCardModels = new ArrayList<>(5);

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("AD WAR")
                    .withImageResId(R.drawable.robotics)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("BAND WAR")
                    .withImageResId(R.drawable.coding)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("OPEN MIC")
                    .withImageResId(R.drawable.pic_card_3)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("THE VOICE")
                    .withImageResId(R.drawable.singing)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("DANCE FEVER")
                    .withImageResId(R.drawable.dancing)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("PARLIAMENT DIRECT")
                    .withImageResId(R.drawable.cricket)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("ONCE UPON A TIME")
                    .withImageResId(R.drawable.badminton)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("NUKKAD NATAK")
                    .withImageResId(R.drawable.pic_card_3)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("THE STAGE")
                    .withImageResId(R.drawable.singing)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("JALWA")
                    .withImageResId(R.drawable.dancing)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("RITAMBHARA")
                    .withImageResId(R.drawable.cricket)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("KISINE KHOOB LIKHA HAI")
                    .withImageResId(R.drawable.badminton)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("SHOWBUZZ")
                    .withImageResId(R.drawable.pic_card_3)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("PIXEL")
                    .withImageResId(R.drawable.singing)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("STOCK-KING")
                    .withImageResId(R.drawable.dancing)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("TREASURE HUNT")
                    .withImageResId(R.drawable.cricket)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("THE SPELLING BEE")
                    .withImageResId(R.drawable.badminton)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }

        return eventCardModels;
    }
}
