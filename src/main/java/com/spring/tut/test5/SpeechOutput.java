package com.spring.tut.test5;

import java.util.Random;

public class SpeechOutput {

	private static String[] stuffBenderSays = {
			"This is the worst kind of discrimination there is: the kind against me!",
			"Hahahahaha. Oh wait you’re serious. Let me laugh even harder.",
			"There. Now no one can say I don’t own John Larroquette’s spine.",
			"I’ll build by own theme park. With black jack, and hookers. In fact, forget the park!",
			"The game’s over. I have all the money. Compare your lives to mine and then kill yourselves!",
			"That’s closest thing to ‘Bender is great’ that anyone other me has ever said.",
			"I’m Bender, baby! Oh god, please insert liquor!",
			"Hey sexy mama, wanna kill all humans?",
			"You know what cheers me up? Other people’s misfortune.",
			"Anything less than immortality is a complete waste of time.",
			"Blackmail is such an ugly word. I prefer extortion. The ‘x’ makes it sound cool.",
			"Have you tried turning off the TV, sitting down with your children, and hitting them?",
			"Oh, your God!",
			"Shut up baby, I know it!",
			"I’m so embarrassed. I wish everyone else was dead!",
			"I got ants my butt, and I needs to strut!",
			"Afterlife? If I thought I had to live another life, I’d kill myself right now!"
	};
	
	public String getText() {
		Random random = new Random();
		
		return stuffBenderSays[random.nextInt(stuffBenderSays.length)];
	}

}
