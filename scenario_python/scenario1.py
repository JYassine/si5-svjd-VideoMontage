# Movie title: scenario1
from moviepy.editor import *
title_firstTitle  =(TextClip(""We were at Nice last summer, it was great :)"",fontsize=70,color='white',bg_color='black')
             .set_position('center')
             .set_duration(10) )
video_video1 = VideoFileClip(""media/chaplin.mp4"")
video_video2 = VideoFileClip(""media/chaplin.mp4"")
title_secondTitle  =(TextClip(""Thank you very much ! "",fontsize=70,color='white',bg_color='black')
             .set_position('center')
             .set_duration(10) )

videoTimeLine = []
videoTimeLine.append(title_firstTitle)
videoTimeLine.append(video_video1)
videoTimeLine.append(video_video2)
videoTimeLine.append(title_secondTitle)
videoListAfterSetStart = []
timer = 0
for video in videoTimeLine :
    videoListAfterSetStart.append(video.set_start(timer))
    timer += video.duration
result = CompositeVideoClip(videoListAfterSetStart) # Overlay text on video
result.write_videofile("scenario1.mp4",fps=25) # Many options...
