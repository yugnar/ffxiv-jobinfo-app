package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_dps.*


/**
 * A simple [Fragment] subclass.
 * Use the [DPSFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DPSFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dps, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        dps_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = DPSAdapter(createData(), context)
        }
    }

    fun createData(): ArrayList<FFXIVJob> {
        val jobs = ArrayList<FFXIVJob>()

        jobs.add(FFXIVJob(R.drawable.drg, "DRG - Dragoon", "Melee", "Of all the things that are symbolic of the nation of Ishgard, few are more recognized than the dragoon. Born amidst the timeless conflict between men and dragons, these lance-wielding knights have developed an aerial style of combat, that they might better pierce the scaled hides of their mortal foes.\n" +
                "Taking to the firmament as though it were an extension of the land, they descend upon the enemy with every onze of their bodies behind the blow. It is this penetrative power that characterizes the dragoon."))
        jobs.add(FFXIVJob(R.drawable.blm, "BLM - Black Mage", "Caster", "In days long past, there existed an occult and arcane art known as black magic—a potent magic of pure destructive force born forth by a sorceress of unparalleled power. Those who learned to wield this instrument of ruin came to be called black mages, out of both fear and respect for their gift. Yet great power served to corrupt the judgment of mortal man, and so he unknowingly set out upon the path of ruin.\n" +
                "Adventurers who take the black will become agents of devastation, capable of annihilating those who oppose them through little more than the force of their will."))
        jobs.add(FFXIVJob(R.drawable.mch, "MCH - Machinist", "Physical Ranged", "The war with Dravania rages on, brutal and unrelenting. With no end in sight, the Holy See grows desperate. As her dragoons lay down their lives in defense of their home, Ishgard turns to technology to protect her sons and daughters. Great cannons and ballistas now line the city walls, plucking dragons from the sky.\n" +
                "Following the example of Cid Garlond, who has demonstrated the potency of magitek, the Skysteel Manufactory works tirelessly on the development of advanced armaments. As new and devastating weapons are brought to the fray, a new class of champion arises to wield them―the machinist."))
        jobs.add(FFXIVJob(R.drawable.sam, "SAM - Samurai", "Caster", "Far across the rolling waves, towards the rising sun, there lies the island nation of Hingashi.\n" +
                "\n" +
                "In the distant past, the realm's great lords vied for supremacy over its seagirt confines in a long and bloody conflict. And taking to battle in their lieges' names were noble swordsmen whose art was forged in the crucible of war: the samurai.\n" +
                "\n" +
                "Eventually, the nation was unified under one banner, and these warriors came to wield their katana not upon fields as part of an army, but upon streets as protectors of the peace.\n" +
                "\n" +
                "But as a neglected blade grows dull with rust, so too do men forget their purpose. Amidst waning memories of the old ways, a determined few hold fast to their convictions, hands by katana grips, awaiting the moment for steel to sing."))
        jobs.add(FFXIVJob(R.drawable.drg, "MNK - Monk", "Melee", "Though now under Garlean rule, the city-state of Ala Mhigo once boasted the greatest military might of all Eorzea. Among its standing armies were the monks—ascetic warriors as dreaded by foes on the field of battle as the city-state's great pikemen.\n" +
                "The monks comprised an order known as the Fist of Rhalgr, and it was to this god—the Destroyer—that they devoted their lives of worship. By mastering seats of power within the body known as chakra, they are capable of performing extraordinary physical feats."))
        jobs.add(FFXIVJob(R.drawable.dnc, "DNC - Dancer", "Physical Ranged", "From the Near Eastern nation of Thavnair comes a troupe of bewitchingly graceful performers. Though certainly elegant and beautiful, their movements also speak of martial discipline─of a pulsing, persistent energy whose rhythm can inspire souls and soothe troubled hearts. Inured to the hardships of the road, these dancers have learned to land throwing weapons with the same exacting precision as their footfalls, removing any who would obstruct the endless beat of the dance."))
        jobs.add(FFXIVJob(R.drawable.rdm, "RDM - Red Mage", "Caster", "On the eastern edge of Abalathia's Spine lies the mountainous region of Gyr Abania.\n" +
                "\n" +
                "It is in these elevated lands that people took shelter, when a burning star guided them away from the Sixth Umbral Calamity's treacherous floodwaters. The survivors gathered from near and far, and amongst them were refugees of the sorcerous cities of Mhach and Amdapor.\n" +
                "\n" +
                "These sworn enemies buried their history for the sake of the future, and cast aside their vestments of black and white. Upon the remnants of their arts a new discipline was built, and the first red mages stepped forward with rapiers in hand to fight back against the rising tides of destruction."))
        jobs.add(FFXIVJob(R.drawable.nin, "NIN - Ninja", "Melee", "Hailing from the war-torn lands of the Far East, the secret arts of the ninja were born of necessity, and have since given rise to a unique breed of highly-trained combatants.\n" +
                "\n" +
                "Able to manipulate the vital energies of the land, the air, and living beings, they manifest their power through the weaving of signs, unleashing a wide array of attacks against their foes. Master the arts of the ninja and learn to bend the tide of battle to your will."))
        jobs.add(FFXIVJob(R.drawable.brd, "BRD - Bard", "Physical Ranged", "The word \"bard\" ordinarily puts folk in mind of those itinerant minstrels, fair of voice and nimble of finger, who earn their coin performing in taverns and the halls of great lords. Few know, however, that bards in fact trace their origins back to the bowmen of eld, who sang in the heat of battle to fortify the spirits of their companions.\n" +
                "In time, their impassioned songs came to hold sway over the hearts of men, inspiring their comrades to great feats and granting peace unto those who lay upon the precipice of death."))
        jobs.add(FFXIVJob(R.drawable.smn, "SMN - Summoner", "Caster", "The beast tribes of Eorzea worship and summon forth beings known as primals, among which are Ifrit, Garuda, and Titan. Yet what is a god to one man is a demon to another, for the city-states of Eorzea see these beings as a grave threat to their collective survival.\n" +
                "In times immemorial, there lived mages who had not only the power to summon the primals, but also the means to transmute the primals' essences, thus binding them to their will. Known simply as summoners, the existence of these men and women and their arcane art have been all but lost to the ages."))
        jobs.add(FFXIVJob(R.drawable.blu, "BLU - Blue Mage", "Caster", "A so-called mage of rather questionable character claims to have mastered an outlandish form of spellcasting that resembles neither black nor white magic during his voyage to the New World. Allegedly, anyone who purchases one of his soul crystals can learn to mimic the aetherial magicks of wild creatures. But can he be trusted, or is he merely a con artist looking to make a quick gil?"))
        jobs.add(FFXIVJob(R.drawable.whm, "WHM - White Mage", "Healer", "White magic, the arcane art of succor, was conceived eras past that the world might know comfort. Alas, man began perverting its powers for self-gain, and by his wickedness brought about the Sixth Umbral catastrophe. Although the art subsequently became forbidden, it is now in the midst of a revival at the hands of the Padjal, chosen of the elementals.\n" +
                "Those who would walk the path of the white mage are healers without peer, possessed of the power to deliver comrades from the direst of afflictions—even the icy grip of death itself."))
        jobs.add(FFXIVJob(R.drawable.sch, "SCH - Scholar", "Healer", "In an age long past, when mankind flourished under the radiance of arcane mastery, the island of Vylbrand was home to a city-state called Nym. Though the history of that age tells of countless wars waged with earth-shattering incantations, it was the brilliant strategic maneuvering of Nym's scholars that allowed their mundane army of mariners to throw back would-be conquerors time and again. These learned men and women defended the freedom of their tiny nation with their unique command over spell-weaving faeries, utilizing the creatures' magicks to heal the wounded and bolster the strength of their allies."))
        jobs.add(FFXIVJob(R.drawable.ast, "AST - Astrologian", "Healer", "Ever has man coveted knowledge, and none more so than that of his fate. Thus did he labor to master the skill of foresight—but initial efforts bore little fruit. That is, until he looked to the stars above, which foretell the coming seasons, and learned to read the heavens.\n" +
                "\n" +
                "Though this gift is known today as astrology, the people of Sharlayan saw fit to not only read the stars, but to write their movements as well. By attuning their aetherial energies to that of constellations, they learned to wield magicks with heretofore unseen properties.\n" +
                "\n" +
                "Thus was astromancy born—a new form of magick which grants its users power over fate. Employing a star globe and divining deck in their miraculous deeds, fortune always smiles upon these masters of arcana."))
        jobs.add(FFXIVJob(R.drawable.pld, "PLD - Paladin", "Tank", "For centuries, the elite of the Sultansworn have served as personal bodyguards to the royal family of Ul'dah. Known as paladins, these men and women marry exquisite swordplay with stalwart shieldwork to create a style of combat uncompromising in its defense. Clad in brilliant silver armor, they charge fearlessly into battle, ever ready to lay down their lives for their liege.\n" +
                "To be a paladin is to protect, and those who choose to walk this path will become the iron foundation upon which the party's defense is built."))
        jobs.add(FFXIVJob(R.drawable.war, "WAR - Warrior", "Tank", "On the northernmost edge of Abalathia's Spine exists a mountain tribe renowned for producing fearsome mercenaries. Wielding greataxes and known as warriors, these men and women learn to harness their inner-beasts and translate that power to unbridled savagery on the battlefield.\n" +
                "In former times which saw war waged ceaselessly in Eorzea, the warriors featured prominently on the front lines of battle. With the arrival of peacetime, however, their art has descended into the shadows of obscurity, where it remains to this day."))
        jobs.add(FFXIVJob(R.drawable.drk, "DRK - Dark Knight", "Tank", "The pious Ishgardian clergy guide the flock, and the devout knights protect the weak. Yet even the holiest of men succumb to the darkest of temptations.\n" +
                "\n" +
                "None dare to administer justice to these sacrosanct elite residing outside the reach of the law. Who, then, defends the feeble from the transgressions of those meant to guide and protect them?\n" +
                "\n" +
                "A valiant few take up arms to defend the downtrodden, and not even the holy priests and knights can escape their judgment. Pariahs in their own land, they are known by many as “dark knights.”\n" +
                "\n" +
                "These sentinels bear no shields declaring their allegiance. Instead, their greatswords act as beacons to guide the meek through darkness."))
        jobs.add(FFXIVJob(R.drawable.gnb, "GNB - Gunbreaker", "Tank", "The Hrothgar of northern Ilsabard have passed the art of the gunblade from one generation to the next. The weapon itself combines a sword with a firing mechanism, emitting a range of magical effects by utilizing aetherially imbued cartridges. Originally employed by Queen Gunnhildr's personal guard, they were once known as \"Gunnhildr's Blades\" and differ greatly from the similarly named weapons used in the Garlean Empire."))

        return jobs
    }
}