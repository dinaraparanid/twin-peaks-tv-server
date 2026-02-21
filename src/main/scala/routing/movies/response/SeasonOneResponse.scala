package com.paranid5.twin_peaks_tv_server
package routing.movies.response

import cats.effect.IO

import com.paranid5.twin_peaks_tv_server.routing.movies.entity.{Actor, Episode, Season}

import io.circe.syntax.*

import org.http4s.Response
import org.http4s.circe.CirceEntityCodec.circeEntityEncoder
import org.http4s.dsl.io.*

def seasonOne: IO[Response[IO]] =
  Ok:
    Season(
      title = "Season 1",
      year = 1990,
      rating = 8.5,
      description = "The first season of the series focuses mainly on the investigation of the mysterious murder of Laura Palmer, a young resident of the small town of Twin Peaks in Washington State. Here are the highlights of the first season:\n\nThe series begins with the discovery of Laura Palmer's body, wrapped in plastic wrap, on the shore of a lake. This event shocks the residents of Twin Peaks and attracts the attention of the FBI.\n\nThe FBI sends Agent Dale Cooper (played by Kyle McLachlan) to the city to investigate the murder. Cooper is unpredictable and intuitive, and he brings unusual methods to the investigation, including dream interpretation and knowledge of Tibetan culture.\n\nDuring the investigation, Cooper and his team encounter many mysterious characters and discover many secrets hidden in the quiet corners of Twin Peaks. It soon becomes clear that Laura's murder is connected to many other mysteries and intrigues in the city.\n\nIn addition to the murder investigation, the first season also focuses on the personal relationships and problems of the main characters, such as Sheriff Harry Truman, Laura's fiancee Margaret Lanterman, as well as Laura Palmer and her friends.\n\nThe series has a mystical atmosphere, exploring dreams and the interrelationships between the world of reality and the world of dreams, which adds mystery and mystery to the plot.",
      thumbnailUrls = List(
        s"$imageHostBaseUrl/season1/thumbnail/pic1.jpg",
        s"$imageHostBaseUrl/season1/thumbnail/pic2.webp",
        s"$imageHostBaseUrl/season1/thumbnail/pic3.jpeg",
        s"$imageHostBaseUrl/season1/thumbnail/pic4.webp",
      ),
      episodes = List(
        Episode(
          title = "01. Northwest Passage",
          rating = 8.9F,
          description = "A body wrapped in cellophane was found on the shore. Sheriff Harry Truman identifies the victim as Laura Palmer, a 17—year-old schoolgirl. Laura's mother, Sarah, is worried about her daughter's absence from home. She calls her husband Leland at the moment when the sheriff brings him bad news. FBI agent Dale Cooper is being sent to Twin Peaks to investigate. He sees a connection between Laura's death and the murder of Teresa Banks, which happened a year earlier. Tiny pieces of paper with letters written on them were found under the nails of both girls. \n\nAt first, Cooper suspects Laura's boyfriend, Bobby. But the girl had another lover, James Hurley, who also has no alibi. The deceased's best friend, Donna Hayward, helps James avoid being targeted by the feds, at least at first. Sarah has a nightmare in which she finds part of her daughter's pendant in the ground. James buried it there.",
          thumbnailUrl = s"$imageHostBaseUrl/season1/episode/e1.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s01e01.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "02. Traces to Nowhere",
          rating = 8.3F,
          description = "During the interrogation, James first denies meeting Laura on the night of her murder, and then confesses, but claims that he was not involved in the death of the girl. According to the conclusion of the medical examiner Hayward, on the eve of her death, Laura had sex with three men. The high school student also took drugs. Waitress Shelly Johnson finds Leo's husband's bloodstained shirt. Later, he beats his wife. Cooper meets Audrey Horn— the daughter of businessman Benjamin. A girl is flirting with an agent. \n\nDonna comes to Sarah to comfort her. At some point, Mrs. Palmer begins to see her as her daughter. Then she notices Bob's silhouette in the corner, which completely unsettles the woman and leads to hysteria. Psychiatrist Lawrence Jacobi, who treated Laura, listens to an audio recording with her voice, gets upset and turns over in his hands part of the pendant, the other half of which was found on the corpse.",
          thumbnailUrl = s"$imageHostBaseUrl/season1/episode/e2.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s01e02.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "03. Zen, or the Skill to Catch a Killer",
          rating = 8.9F,
          description = "Benjamin and Jerry Horn go to a casino-brothel called \"One Eyed Jacks\". The establishment is located on the Canadian-American border. Another FBI agent is coming to town. Cooper tried out a new system for excluding suspects from the case, because there were too many of them. Leo Johnson and Lawrence Jacobi are the most suspicious of Dale. Donna confesses her feelings to James: she had previously hesitated to do so for fear of being rejected and Laura looming on the horizon. Donna and James begin a relationship. \n\nLeo catches Bobby and Mike, who wanted to take drugs from the cache. He blackmails the couple and hints that he knows about his wife's infidelities. Later, Bobby visits Shelly, who has been beaten by her husband again. Cooper has a disturbing dream involving Bob, Mike, and Laura. He wakes up and contacts the sheriff, stating that he knows who killed the girl.",
          thumbnailUrl = s"$imageHostBaseUrl/season1/episode/e3.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s01e03.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "04. Rest in Pain",
          rating = 8.3F,
          description = "Cooper unravels his dream, as he believes that it contains the answer to Laura's murder. Audrey had slipped a note mentioning a brothel under Dale's door, and he had guessed it. Albert Rosenfield performs an autopsy, and learns a lot about the victim's life. The medical examiner had an argument with Truman and got punched in the face by the sheriff. At Laura's funeral, Bobby makes a scene, accusing others of inaction: the deceased needed help, but the people around her stayed away. There is a scuffle between Bobby and James. Jacques Renault asks Leo for help after learning about the detention of Bernard's brother. \n\nCooper learns about the secret society \"Bookhouse Boys\": its members protect the city from supernatural evil. Maddie Ferguson, Laura's cousin and exact copy (except for the color of her hair), arrives in Twin Peaks. Josie tells Harry, with whom she is having an affair, that one of the accounting books is missing from the safe. Catherine Martell and Benjamin Horn conspired to damage Josie's sawmill.",
          thumbnailUrl = s"$imageHostBaseUrl/season1/episode/e4.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s01e04.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "05. The One-Armed Man",
          rating = 8.1F,
          description = "Norma is forced to help her husband Hank get out of prison on parole. She already has another relationship, but a woman cannot refuse. Once free, Jenkins calls Josie. James runs into Maddie and is struck by her resemblance to Laura. Shelly shows Bobby her husband's bloodstained shirt. The guy promises his mistress that with the help of this evidence he will be able to get rid of Leo. \n\nCooper and the sheriff are looking for the bird that left wounds on Laura's body. It belongs to Jacques Renault, and a search of his house turns out to be a useful idea. After tracking Mike down, Dale asks him about Bob and gets contradictory answers. The agent had previously suspected Dr. Jacobi. Josie keeps an eye on the motel where Benjamin and Catherine meet. This couple wants to set a fire at the sawmill. Audrey reconciled with her father in order to gain access to the perfume department where Laura worked. Audrey and Donna agree to conduct their own investigation into their friend's death.",
          thumbnailUrl = s"$imageHostBaseUrl/season1/episode/e5.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s01e05.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "06. Cooper's Dreams",
          rating = 8.5F,
          description = "Cooper is not getting enough sleep because of the noisy Icelandic investors who have moved into the hotel. Leland wants to go back to work, but he's still not himself, and the boss sends the unhappy father home. The blood on Leo's shirt does not belong to Laura, but to Jacques Renault. A fragment of a playing chip from the One Eyed Jacks casino was found in his hut, identical to the one found in Laura's stomach. Waldo's bird was also in the cage. Shelly and Bobby were thinking about Leo's murder. When her husband came home and attacked Shelly, she was able to fire a pre-prepared pistol. \n\nCooper meets an eccentric lady with a log. James and Donna convince Maddie to look for Laura's diary, since she now lives in the Palmer house. Josie spies on Katherine and Benjamin: the couple plans to burn down the sawmill and buy the land cheaply. Bobby discusses Laura's condition at Jacobi's session: the girl was thinking about death and forced him to sell drugs. Audrey arrives at Cooper's room late at night…",
          thumbnailUrl = s"$imageHostBaseUrl/season1/episode/e6.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s01e06.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "07. Realization Time",
          rating = 8.5F,
          description = "Cooper is not going to sleep with Audrey, but offers her friendship. The agent is betting on Waldo — the bird can imitate a previously heard voice, which means that sooner or later it will give a hint. Leo, who was injured by his wife, learns first about Shelly and Bobby's relationship, and then about the bird. He kills Waldo, but Cooper manages to get what he wanted. Johnson is now among the main suspects. Cooper and Truman are going to visit an undercover casino brothel. Audrey also wants to get a job as a call girl there: while working in the perfume department, she found clues leading directly to One Eyed Jacks. \n\nJames, Donna, and Maddie found Laura's notes. They set up a trap for Dr. Jacobi to get the missing film. Bobby hides drugs in James' motorcycle, wanting to frame him. Josie is changing the rules of the game in the sawmill situation. She offers Benjamin cooperation in exchange for getting rid of Catherine. Hank was with Josie during the phone conversation.",
          thumbnailUrl = s"$imageHostBaseUrl/season1/episode/e7.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s01e07.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "08. The Last Evening",
          rating = 9F,
          description = "Working undercover at One Eyed Jacks, Cooper managed to expose Jacques Renault and arrest him. The perpetrator was injured during the arrest and ended up in the hospital. He blames Johnson for what is happening. Leland finds out about his daughter's killer and strangles Jacques with his own hands. Johnson forcibly brought his wife to a sawmill, which he plans to burn down. He's also trying to kill Bobby. Hank shows up in time and kills Leo. Jenkins worked for Josie: she paid to cover up the circumstances of her husband's death. Catherine helps Shelly free herself, but a fire has already started at the sawmill. \n\nThe meeting between Jacobi and Maddie, disguised as Laura, did not go according to plan. James, Donna, and Maddie recognize Laura from a different angle. Nadine took pills to commit suicide. Ed found his wife and called an ambulance. James is arrested for drugs hidden in his motorcycle by Bobby. Returning to the hotel room, Cooper learns the news of Johnson's death by phone. Upon hearing the knock, the agent opens the door and receives three bullets.",
          thumbnailUrl = s"$imageHostBaseUrl/season1/episode/e8.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s01e08.TwinPeaks.top.mp4"
        ),
      ),
      actors = List(
        Actor(
          name = "Kyle MacLachlan",
          character = "Special Agent Dale Cooper",
          thumbnailUrl = "https://upload.wikimedia.org/wikipedia/ru/thumb/5/50/Agentdalecooper.jpg/330px-Agentdalecooper.jpg",
        ),
        Actor(
          name = "Sheryl Lee",
          character = "Laura Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/92/Laura_Palmer_%281989%29.jpg/revision/latest?cb=20180219220542",
        ),
        Actor(
          name = "Lara Flynn Boyle",
          character = "Donna Hayward",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/8/85/Donna_LFB.jpg/revision/latest?cb=20221026174227",
        ),
        Actor(
          name = "James Marshall",
          character = "James Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/66/Jamesnew.jpg/revision/latest?cb=20161026024503",
        ),
        Actor(
          name = "Sherilyn Fenn",
          character = "Audrey Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/98/AudreyNew.jpg/revision/latest?cb=20161026025355",
        ),
        Actor(
          name = "Richard Beymer",
          character = "Benjamin Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/fa/Ben_001.jpg/revision/latest?cb=20100419234934",
        ),
        Actor(
          name = "David Patrick Kelly",
          character = "Jerry Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/5/54/Jerryhornedpk.jpg/revision/latest?cb=20160511122515",
        ),
        Actor(
          name = "Michael Ontkean",
          character = "Sherrif Harry S. Truman",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/c/c7/HarryNew.jpg/revision/latest?cb=20161026022237",
        ),
        Actor(
          name = "Kimmy Robertson",
          character = "Lucy Moran",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/4/47/LucyNewAgain.jpg/revision/latest?cb=20161026023511",
        ),
        Actor(
          name = "Harry Goaz",
          character = "Andy Brennan",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/7/72/AndyNew.jpg/revision/latest?cb=20161026025038",
        ),
        Actor(
          name = "Michael Horse",
          character = "Hawk",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/a/a1/DeputyHawkAtTheDiner.jpg/revision/latest?cb=20160925005033",
        ),
        Actor(
          name = "Miguel Ferrer",
          character = "Albert Rosenfield",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/e/e6/AlbertRosenfeld.jpg/revision/latest?cb=20100330010337",
        ),
        Actor(
          name = "David Lynch",
          character = "Gordon Cole",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/7/7a/GordonColeNewMainPhoto.png/revision/latest?cb=20171109180605",
        ),
        Actor(
          name = "Mädchen Amick",
          character = "Shelly Johnson",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/66/Shelly_Johnson.png/revision/latest?cb=20230321101316",
        ),
        Actor(
          name = "Dana Ashbrook",
          character = "Bobby Briggs",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/98/BobbyHiRes.jpg/revision/latest?cb=20161101195815",
        ),
        Actor(
          name = "Eric Da Re",
          character = "Leo Johnson",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/a/a7/Leo_Johnson.jpg/revision/latest?cb=20161025123520",
        ),
        Actor(
          name = "Everett McGill",
          character = "Ed Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/3c/BigEdNewPic.jpg/revision/latest?cb=20170524152240",
        ),
        Actor(
          name = "Wendy Robie",
          character = "Nadine Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/4/4b/NadineNew.jpg/revision/latest?cb=20161026023639",
        ),
        Actor(
          name = "Peggy Lipton",
          character = "Norma Jennings",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/f3/Norma14214.jpg/revision/latest?cb=20161030052435",
        ),
        Actor(
          name = "Chris Mulkey",
          character = "Hank Jennings",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/f5/HankHiRes2.jpg/revision/latest?cb=20161101201553",
        ),
        Actor(
          name = "Grace Zabriskie",
          character = "Sarah Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/30/Sarah_007.png/revision/latest?cb=20170711230313",
        ),
        Actor(
          name = "Ray Wise",
          character = "Leland Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/c/cd/LelandPalmer.jpg/revision/latest?cb=20160816065237",
        ),
        Actor(
          name = "Russ Tamblyn",
          character = "Dr. Lawrence Jacoby",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/6f/JacobyNew.jpg/revision/latest?cb=20161025125112",
        ),
        Actor(
          name = "Joan Chen",
          character = "Josie Packard",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/8/8b/JosieNew.jpg/revision/latest?cb=20161026022344",
        ),
        Actor(
          name = "Jack Nance",
          character = "Pete Martell",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/3d/Pete_Martell.jpg/revision/latest?cb=20170822052012",
        ),
        Actor(
          name = "Piper Laurie",
          character = "Catherine Martell",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/b/ba/Catherine_Martell_Infobox.jpg/revision/latest?cb=20231015113852",
        ),
        Actor(
          name = "Frank Silva",
          character = "BOB",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/37/KillerBob.jpg/revision/latest?cb=20100423043335",
        ),
        Actor(
          name = "Michael J. Anderson",
          character = "The arm (The Man from Another Place)",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/0/0f/MFAPsitting.jpg/revision/latest?cb=20100709031955",
        ),
        Actor(
          name = "Al Strobel",
          character = "Mike (The one-armed man)",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/d/d4/MikeDream.jpg/revision/latest?cb=20100911201926",
        ),
        Actor(
          name = "Catherine E. Coulson",
          character = "Margaret Lanterman (Log Lady)",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/68/Logladyreplacement.jpg/revision/latest?cb=20160906170235",
        ),
      )
    )
      .asJson
