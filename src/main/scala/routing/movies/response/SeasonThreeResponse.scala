package com.paranid5.twin_peaks_tv_server
package routing.movies.response

import routing.movies.entity.{Actor, Episode, Season}

import cats.effect.IO
import io.circe.syntax.*
import org.http4s.Response
import org.http4s.circe.CirceEntityCodec.circeEntityEncoder
import org.http4s.dsl.io.*

def seasonThree: IO[Response[IO]] =
  Ok:
    Season(
      title = "Season 3",
      year = 2017,
      rating = 8.5,
      description = "The third season of Twin Peaks (also known as Twin Peaks: The Return) is a miniseries released in 2017 after a long hiatus since the conclusion of the second season. This season continues the story of Twin Peaks, bringing viewers back to the world of mystery and mysticism.\n\nThe plot begins with the return of FBI agent Dale Cooper to the city of Twin Peaks after many years of absence. Cooper is faced with new mysteries and mysteries, as well as the changes that have taken place in the city during his absence.\nOver the course of the miniseries, new mysterious events and characters appear, adding new layers to the already complex plot of Twin Peaks.",
      thumbnailUrls = List(
        "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-2-frame-5.jpg",
        "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-8-frame-9.jpg",
        "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-4-frame-14.jpg",
        "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-9-frame-9.jpg",
        "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-4-frame-1.jpg",
        "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-13-frame-10.jpg",
        "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-13-frame-15.jpg",
        "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-13-frame-3.jpg",
        "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-16-frame-2.jpg",
      ),
      episodes = List(
        Episode(
          title = "01. My Log Has a Message for You",
          rating = 8.6F,
          description = "Laura and Dale are talking in the lodge. The girl says they will meet in 25 years. Cooper's doppelganger in South Dakota hires two people for some kind of business. The lady with the log contacts Hawke and asks him to listen to a message from her \"companion\" related to Dale's disappearance. Benjamin Horn has a new assistant, Beverly. And his brother Jerry continues to experiment with drugs. \n\nSam Colby has a dusty and well-paid job in New York: he sits in a room with cameras and watches a transparent cube. We need to let you know if something appears in it. There is a guard at the door to the room. When he leaves, Sam takes Tracey's girlfriend inside. While the couple is having sex, an entity forms in the cube, breaks free and kills both of them. In South Dakota, the head of the hostess and the body of an unknown man are found in the apartment of librarian Ruth Davenport. There are a lot of fingerprints of the school principal Bill Hastings at the crime scene, who cannot explain these oddities or provide an alibi.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-1-frame-5.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e01.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "02. The Stars Turn and a Time Presents Itself ",
          rating = 8.6F,
          description = "His wife visits Bill in prison and does not believe his story about a dream about Ruth's apartment: Phyllis is sure that the couple had an affair. The couple quarrel, and Bill declares that he also knows about the relationship between Phyllis and their lawyer George. Cooper is in the wigwam talking to Laura, a Giant, a One-armed Man, and a tree with a strange human head. Dale wonders how long he's been here, and when he can leave. He is asked to recall his doppelganger: as soon as the doppelganger returns to the wigwam, the real Cooper will be free. \n\nThe evil doppelganger, on the contrary, tends not to get into the \"wigwam\". He needed information, so he killed Phyllis. The assistants betrayed the Doppelganger: they took money for his elimination, but were eliminated themselves. Cooper's doppelganger needs Bill for some reason. The real Dale got out of the wigwam and materialized briefly in the cube while Sam was out picking up Tracy, so he went unnoticed. Shelly is at the bar discussing her daughter's choice with her friends and sees James enter.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-2-frame-6.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e02.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "03. Call for Help",
          rating = 8.4F,
          description = "Cooper is still barely thinking straight and doesn't really understand how he moves from one location to another. He met a woman with no eyes, went up to the roof with her, and then received a warning to avoid meeting someone who was currently diligently knocking on the door. In addition to the doppelganger based in South Dakota, Dale has another doppelganger living under the name Dougie Jones. He suddenly finds himself in a \"wigwam\". Dagi was created with a specific purpose, and it has been achieved, so all that remains of the doppelganger is a ring and a ball, and he disappears. \nDougie's friend Jade mistakes Cooper for her boyfriend. She gives him five dollars and drops him off at the casino. Dale, using machine guns with a wigwama badge, wins the jackpot. Cole and other agents investigate the deaths of Sam and Tracy. It is not even known who owns the building, and what happened there. Gordon is informed that Cooper, who has been missing for a long time, has been spotted in South Dakota: the doppelganger had an accident there.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-3-frame-3.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e03.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "04. …Brings Back Some Memories",
          rating = 8.5F,
          description = "Having won more than 400 thousand at the casino, Dale does not know what to do next. Since he is still mistaken for Dagi, he is taken to the doppelganger's house. Jones' wife, Janie-Yi, swears at \"her husband\" at first, but then sees the money and changes her anger to mercy. Cooper's condition is still far from ideal, so he does not participate in conversations, and in the morning, the household notices his atypical behavior and appearance. \n\nThe police force in Twin Peaks has changed somewhat over the years. Bobby is now also one of the law enforcement officers. He and Hawk and the others are working on an investigation into the disappearance of something related to Cooper. Before going to South Dakota, Cole enlists the help of Denise, who has accepted a promotion. The doppelganger is behind bars because they found a lot of illegal stuff in his car after the accident. The doppelganger claims to be working undercover. They don't trust him too much and want to take a closer look.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-4-frame-1.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e04.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "05. Case Files",
          rating = 8.1F,
          description = "Cooper is in trouble at Dougie's job. Dale is already uncomfortable, and his colleague is lying in his direction, and his boss doesn't want to figure out the problem. They tried to blow up Cooper's car, but the agent was not injured, as the hijackers managed to get in there. The owners of the casino, the Mitcham brothers, give the manager a beating: the day before, Jones won too much money from their establishment, so it is believed that someone helped with the scam from the inside. Shelly's wayward daughter, Becky, asks her mother for money and uses it to buy drugs for herself and a friend. \n\nThe doppelganger calls from the prison, dialing a very long code, which damages the security system. The headless corpse, according to the prints, turned out to be the long-missing Major Briggs. Dagi's ring was found in his stomach. Even the Pentagon became interested in this case, as 16 similar cases have already occurred over the past quarter century.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-5-frame-16.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e05.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "06. Don't Die",
          rating = 8.1F,
          description = "Janie was able to pay off her debts using the money she won. She accuses her \"husband\" of cheating because she got his picture in Jade's company. Dale is still not at ease, but he manages to butter up the boss by accidentally doing a good job, and in a way that no one expected from him. Duncan Todd, who works for Doppelganger, and the so-far unnamed dwarf must follow the instructions. The dwarf, for example, stabs Loraine and her colleagues. Cooper's former assistant, Diana, comes to meet Albert at the bar. Dale has a new vision involving Mike. At first, he said that there should be only one left (hinting at doppelgangers), but now he advises you to wake up and not die. \n\nA tragedy is happening in Twin Peaks. Richard Horn, Benjamin's grandson— drove into the oncoming lane, killed the boy and fled the scene of the accident. It was seen by the owner of the trailer park, Carl Rodd. And Hawk, in the toilet cubicle, finds strange scribbled pages due to his reverent attitude towards the culture of his ancestors.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-6-frame-7.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e06.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "07. There's a Body All Right ",
          rating = 8.7F,
          description = "After reading the notes, Hawk recognized parts of Laura's diary in them. They say that the real Cooper never left the wigwam, sacrificing himself for the sake of freedom and Annie's life. Frank Truman, the brother of former Sheriff Harry, gathers information about that ill—fated day to find out the truth. The Feds are also interested in the investigation. They confront Doppelganger and Diana. Dale's former assistant is sure that this is the first time she has seen this man, even though he looks little different from her ex-boss. \n\nIn South Dakota, there are problems with Briggs' prints: his body is younger than it should be, by about 20-25 years. Cooper, posing as Dougie against his will, is interested in the police: the guards were attracted by the explosion of the car of an inconspicuous insurer. The dwarf is also awake and is waiting for Dale at the office with a gun. Because it smells fried, the doppelganger is blackmailed into freedom, taking with him Ray— his henchman, who was arrested earlier.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-7-frame-7.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e07.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "08. Gotta Light?",
          rating = 8.7F,
          description = "The Doppelganger needs information from Ray, but Ray is in no hurry to share it. There is a scuffle during the stop. The advantage was on the side of the doppelganger, but his henchman replaced the boss's cartridges with blanks. Ray seized the initiative and wounded the doppelganger three times. Then strange translucent entities appeared, including Bob's face. They scared Ray off, and he was forced to send a message to the customer that the target could have survived. The doppelganger stays in place and recovers. \n\nThe events are transferred to 1945 at the time of the explosion of the first nuclear bomb in New Mexico. It was then that Bob was born in his current form, as well as the Experiment — the essence of a transparent cube, and the foundation for other supernatural things was laid. After 11 years, the situation began to develop even faster. The harsh lumberjacks left behind a lot of corpses, and the chimera that hatched from the egg got into the girl's body through her mouth.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-8-frame-9.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e08.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "09. This Is the Chair",
          rating = 8.3F,
          description = "The Doppelganger still made it to the ranch and sent two messengers to deal with Murphy's jailer. He also manages to call Todd and sends a message to Diana. Since there are no records of Dougie and there are no documents dated earlier than 1997, the feds have an assumption that he is in the witness protection program. There is still hope for a DNA test and the talkativeness of the dwarf Ike Spiegel, who must first be caught. \n\nJerry Horn allegedly has his leg taken away (part of his realistic vision). Briggs knew that the day of such a big investigation would come, so he left clues for the guards — decryption of data received from space. And Cooper's last name is mentioned there twice. Hastings tells Agent Tammy Preston how he met the \"canned\" Briggs in another dimension.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-9-frame-9.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e09.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "10. Laura Is the One",
          rating = 8.1F,
          description = "Richard Horn, in his usual manner, deals with the witness, who was ready to tell about the accident in a letter to the sheriff. Richard's employer intercepts the recordings. Then the guy robs his own grandmother. Sylvia calls Benjamin to return the money. The lady with the log calls Laura Palmer the chosen one in a conversation with Hawke. \n\nThe owners of the casino, where Cooper won a large sum in the form of Dougie, recognized the \"fraudster\" in a report on the arrest of Ike Spiegel. They want to teach an arrogant client a lesson, so they find an approach to an insurer from Dougie's office, with whom the real Cooper recently had a conflict, and offer to slander a colleague. Allegedly, Jones deliberately did not pay the Mitch brothers for the recent fire. The amount of the dispute is about 30 million. Tammy Preston was able to get Doppelganger photos from the murder scene in New York. According to Diana's message, it can be understood that Hastings has been arrested.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-10-frame-12.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e10.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "11. There's Fire Where You Are Going",
          rating = 8.9F,
          description = "The Mitcham brothers set a trap for Dougie (Cooper). When he comes to a meeting to hand over a check for 30 million, the \"lucky guy\" will be killed. The day before, one of the casino owners, Bradley, has a dream from which it becomes clear that Dougie did not intentionally harm them or cheat. Therefore, the original plan is canceled and the meeting takes place in a friendly atmosphere. \n\nThere are two shootings in Twin Peaks in a row. First, Becky shoots through the door from her mother's car into the house of Stephen's mistress, and then the child shoots at the diner from the street. The commotion allows us to find a remarkable couple in one of the cars — a woman with a sick girl. During the federal investigation, Hastings leads agents to the place where he and Ruth met Major Briggs. They manage to find Ruth's body with the coordinates on her arm. A vortex forms in the sky, and Gordon is almost sucked in. Albert saves him. There were lumberjacks in the vortex, and one of them killed Hastings in front of Diana's eyes.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-11-frame-14.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e11.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "12. Let's Rock",
          rating = 7.7F,
          description = "It's time to fill Tammy and Diana in on the Blue Rose Squad. The coordinates on the deceased Ruth's arm point to Twin Peaks. Audrey is looking for her ex-lover and connects her husband to the investigation. Charlie didn't want to interfere, but he had to. He learned the sad news and did not inform his wife about it. Hawke visits Sarah Palmer, as she became ill at the store. Sheriff Frank Truman tells Benjamin about the accident caused by his grandson. Not only did Richard kill the child, but he also tried to get rid of the witness. Horn Sr. regrets what happened and promises to cover all expenses for Miriam's treatment. Benjamin gives Frank the key to room 315 as a souvenir for Harry. \n\nThe Doppelganger mercenaries dealt with Murphy. Cooper is increasingly immersed in Dougie's life and even spends time with his son playing ball.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-12-frame-11.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e12.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "13. What Story is That, Charlie?",
          rating = 8.3F,
          description = "Cooper now has no problems with the Mitcham brothers, but Anthony Sinclair must kill him, or rather Dougie, on the order of Duncan Todd. He had already bought the poison and put it in the drink, but changed his mind and canceled the attempt. The Doppelganger arrives to meet the gang, Ray and Richard Horn. The leader manages to defeat and kill. And Ray, having initially received the customer's name from him (Phillip Jeffries), is forced by the doppelganger to wear the ring of the \"black lodge\". The Doppelganger kills Ray as well, and Ray is transported to Mike and company. \n\nShelly has a friend, Renee. She and James clearly like each other. During Hurley's performance in \"House by the Road,\" Renee was moved. Dr. Jacobi and Nadine are meeting for the first time in many years. Norma was able to expand her business, thanks to Walter, and opened several more establishments.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-13-frame-4.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e13.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "14. We Are Like the Dreamer",
          rating = 9.0F,
          description = "Tammy learns more about the first Blue Rose case. Gordon becomes aware of the pages found from Laura's diary and the two Coopers mentioned. Diana identified Janie as her stepsister. The feds from Vegas are being called up to find the Jones couple. Following the clues Briggs left for the guards, the sheriff and his deputies find Naido in the forest. She is naked, and when Andy tries to touch the girl, he finds himself in another world. He sees a Firefighter, both Coopers, Laura Palmer, events that happened in the middle of the last century in New Mexico, and much more. Then he comes back. \n\nIn a bar, a trucker accosts Sarah. She shows the insolent man her true nature, darkness, and then kills him. Billy, splattering blood from his nose all around, burst into Megan's kitchen, and then hurriedly retreated. James is haunted by the noise from the boiler room.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-14-frame-7.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e14.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "15. There's Some Fear in Letting Go",
          rating = 8.7F,
          description = "Renee has a husband, Chuck, who comes to the House by the Road to deal with James. Freddy comes to the rescue, who, after meeting with a Firefighter, bought a rubber glove and can use it to increase his strength. Since Chuck is in the hospital, the other two participants in the brawl are being detained. Ruby appears in the bar, crawling on the floor and screaming. Nadine finally gives her husband a divorce. Ed proposes to Norma. She is ready to sell most of the business to her partner in order to free herself from obligations and marry her long-time lover. \n\nThe Doppelganger makes inquiries at the gas station about Judy and the attempted murder. Jeffries, presented in an unusual guise, gives an equally vague answer. Duncan Todd and his assistant were killed in Vegas. Richard tried to kill Cooper's doppelganger, as he knows that his mother was acquainted with the agent in the past. The Doppelganger calms Horn Jr. down. As soon as the real Dale hears Gordon's name, he puts the plug in the socket.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-15-frame-8.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e15.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "16. No Knock, No Doorbell",
          rating = 9.5F,
          description = "Using the coordinates obtained from Diana or Jeffries, the doppelganger, accompanied by Richard, arrives at the target he needs. The doppelganger directs Horn Jr., and he is electrocuted in front of Jerry. Audrey is moving further away from reality. She saw herself dancing in the \"House by the Road\", and found herself in front of her own reflection in a snow-white room. \n\nThe Doppelganger mercenaries got as close as possible to the Joneses, but were killed. Cooper came to his senses after the incident with the outlet, and learned that Mike could make another copy of the doppelganger. Dale asks the casino owners to arrange a flight to Spokane. Diana received a message from the doppelganger and showed her true self. They had to kill her. Diana also turned out to be a copy and was made for a specific purpose.",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-16-frame-14.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e16.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "17. The Past Dictates the Future",
          rating = 9.3F,
          description = "Even 25 years ago, Major Briggs told Cooper and Cole about the existence of a supernatural substance called Judy. Agent Jeffries was also aware of the situation, but he knew that the search could be dangerous, and everyone would pay a price. The Doppelganger pretends to be the real Cooper, but he fails to play the role to the end: Lucy, as predicted, kills the doppelganger. Lumberjacks appear and take out a sphere with a Bean inside. Freddy intervenes and destroys the evil spirit. The real Dale puts a ring on Bob, and the corpse disappears, and the ring is moved to the \"black lodge\". Naido turns out to be the real Diana. \n\nJeffries takes Cooper back to February 23, 1989, so that the agent can prevent the murder of Laura Palmer. And so it turns out: they meet at the right moment, and the girl remembers Dale, so she trusts him. Her body is not found the next morning. However, Laura disappears from Cooper's sight when he hears the scratching sound of Judy approaching…",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-17-frame-9.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e17.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "18. What Is Your Name?",
          rating = 8.7F,
          description = "Mike created a new Dougie in the black lodge so that he could reunite with his wife and son. Cooper and Diana make a long journey side by side, not knowing exactly where and in what time period they are. The couple gets to the hotel and spends the night together. In the morning, Cooper wakes up alone in a different place, and a note is written in Richard's name from Linda asking him not to look. \n\nDale goes to Odessa, Texas. There he stands up for the waitress and gets the address of her colleague Carrie Page, an exact copy of Laura Palmer. The woman is confused, but agrees to go to Twin Peaks with Cooper, as she has long wanted to move to another place. Some signs indicate that something is wrong in this reality. There are other people living in the Palmers' house. Dale decides to find out what year it is. He and Carrie turn back to the house and hear Sarah calling her daughter, and Carrie automatically answers her the way Laura would…",
          thumbnailUrl = "https://twinpeaks.top/images/frames/twin-peaks-season-3-episode-18-frame-16.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s03e18.TwinPeaks.top.mp4"
        ),
      ),
      actors = List(
        Actor(
          name = "Kyle MacLachlan",
          character = "Special Agent Dale Cooper",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/8/81/Dale_Cooper_%282010s%29.jpg/revision/latest?cb=20170815022327",
        ),
        Actor(
          name = "Sheryl Lee",
          character = "Laura Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/f0/Laura_Palmer_%282010s%29.jpg/revision/latest/scale-to-width-down/1000?cb=20170820222335",
        ),
        Actor(
          name = "James Marshall",
          character = "James Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/90/JamesRoadhouse.png/revision/latest?cb=20170807173150",
        ),
        Actor(
          name = "Eamon Farren",
          character = "Richard Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/a/aa/Richard_Horne.jpg/revision/latest/scale-to-width-down/1000?cb=20170805011303",
        ),
        Actor(
          name = "Sherilyn Fenn",
          character = "Audrey Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/7/79/AudreyHorne2014.jpg/revision/latest?cb=20170731215823",
        ),
        Actor(
          name = "Richard Beymer",
          character = "Benjamin Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/5/52/Benjamin_Horne_%282010s%29.jpg/revision/latest?cb=20170915214300",
        ),
        Actor(
          name = "David Patrick Kelly",
          character = "Jerry Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/2/24/Jerry_Horne_%282010s%29.jpg/revision/latest?cb=20170923012615",
        ),
        Actor(
          name = "Robert Forster",
          character = "Sherrif Frank Truman",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/93/Frank_002.jpg/revision/latest?cb=20170724070837",
        ),
        Actor(
          name = "Harry Goaz",
          character = "Andy Brennan",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/9f/Andy_Brennan_%282010s%29.jpg/revision/latest?cb=20170814111711",
        ),
        Actor(
          name = "Kimmy Robertson",
          character = "Lucy Brennan",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/1/10/Lucy_Brennan_%282010s%29.jpg/revision/latest?cb=20170915174134",
        ),
        Actor(
          name = "Michael Horse",
          character = "Hawk",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/e/ee/Hawk_%282010s%29.jpg/revision/latest?cb=20170915173246",
        ),
        Actor(
          name = "David Lynch",
          character = "Gordon Cole",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/f0/Gordon_Cole_%282016%29.png/revision/latest/scale-to-width-down/1000?cb=20230404141651",
        ),
        Actor(
          name = "Miguel Ferrer",
          character = "Albert Rosenfield",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/7/72/Albert_Rosenfield.jpg/revision/latest?cb=20170805003936",
        ),
        Actor(
          name = "Laura Dern",
          character = "Diane Evans",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/7/7b/Diane_Evans_%28tulpa%29.jpg/revision/latest?cb=20170915215249",
        ),
        Actor(
          name = "Chrysta Bell",
          character = "Tamara Preston",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/1/12/Tammy_Preston.jpg/revision/latest?cb=20170805003656",
        ),
        Actor(
          name = "Dana Ashbrook",
          character = "Bobby Briggs",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/ff/Bobby_Briggs_%282010s%29.jpg/revision/latest?cb=20170915181919",
        ),
        Actor(
          name = "Mädchen Amick",
          character = "Shelly Briggs",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/4/47/Shelly_Briggs_%282010s%29.jpg/revision/latest?cb=20180112042048",
        ),
        Actor(
          name = "Amanda Seyfried",
          character = "Becky Burnett",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/2/2a/Becky_Burnett.jpg/revision/latest?cb=20170823053829",
        ),
        Actor(
          name = "Caleb Landry Jones",
          character = "Steven Burnett",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/1/12/Steven_Burnett.jpg/revision/latest?cb=20170822214222",
        ),
        Actor(
          name = "Everett McGill",
          character = "Ed Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/b/be/Ed_Hurley_%282010s%29.jpg/revision/latest?cb=20170923012938",
        ),
        Actor(
          name = "Wendy Robie",
          character = "Nadine Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/4/42/Nadine2017.jpg/revision/latest?cb=20170605210408",
        ),
        Actor(
          name = "Peggy Lipton",
          character = "Norma Jennings",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/1/19/Norma_Jennings_%282010s%29.jpg/revision/latest?cb=20190819185933",
        ),
        Actor(
          name = "Grace Zabriskie",
          character = "Sarah Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/fa/Sarah_palmer_2017.png/revision/latest?cb=20170731011136",
        ),
        Actor(
          name = "Ray Wise",
          character = "Leland Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/d/df/Leland2017.png/revision/latest?cb=20170625011021",
        ),
        Actor(
          name = "Russ Tamblyn",
          character = "Dr. Lawrence Jacoby",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/2/22/Lawrence_Jacoby_%282010s%29.jpg/revision/latest?cb=20170824195051",
        ),
        Actor(
          name = "Jake Wardle",
          character = "Freddie Sykes",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/9c/Freddie_Sykes.jpg/revision/latest?cb=20170821105510",
        ),
        Actor(
          name = "George Griffith",
          character = "Ray Monroe",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/91/Ray_Monroe.jpg/revision/latest?cb=20170915173507",
        ),
        Actor(
          name = "Carel Struycken",
          character = "Fireman",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/d/d0/Fireman.jpg/revision/latest/scale-to-width-down/1000?cb=20170814110523",
        ),
        Actor(
          name = "Catherine E. Coulson",
          character = "Margaret Lanterman (Log Lady)",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/97/Margaret_Lanterman_%282010s%29.jpg/revision/latest?cb=20170825191537",
        ),
        Actor(
          name = "Don S. Davis",
          character = "Garland Briggs",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/f5/Garland_Briggs.png/revision/latest?cb=20161021155038",
        ),
        Actor(
          name = "Al Strobel",
          character = "Mike",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/1/13/Mike_%282010s%29.jpg/revision/latest?cb=20170915174337",
        ),
        Actor(
          name = "Frank Silva",
          character = "BOB",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/37/KillerBob.jpg/revision/latest?cb=20100423043335",
        ),
        Actor(
          name = "Robert Broski ",
          character = "Woodsman",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/b/b3/GottaLight.png/revision/latest?cb=20170626141331",
        ),
      )
    )
      .asJson
