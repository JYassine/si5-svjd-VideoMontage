/**
 * generated by Xtext 2.24.0
 */
package org.xtext.svjd.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.svjd.videoMontageSVJD.Clip;
import org.xtext.svjd.videoMontageSVJD.Movie;
import org.xtext.svjd.videoMontageSVJD.Title;
import org.xtext.svjd.videoMontageSVJD.Video;
import org.xtext.svjd.videoMontageSVJD.VideoElement;
import org.xtext.svjd.videoMontageSVJD.VideoTimeLine;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class VideoMontageSVJDGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Object root = resource.getContents().get(0);
    if ((!(root instanceof Movie))) {
      return;
    }
    Movie movie = ((Movie) root);
    String _title = movie.getTitle();
    String _plus = (_title + ".py");
    fsa.generateFile(_plus, this.compile(movie));
  }
  
  public CharSequence compile(final Movie movie) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Movie title: �movie.title�");
    _builder.newLine();
    _builder.append("from moviepy.editor import *");
    _builder.newLine();
    _builder.append("�FOR VideoElement videoelement : movie.videoelement�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�declare(videoelement)�");
    _builder.newLine();
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.newLine();
    _builder.append("�declare(movie.videoTimeline)�");
    _builder.newLine();
    _builder.append("videoListAfterSetStart = []");
    _builder.newLine();
    _builder.append("timer = 0");
    _builder.newLine();
    _builder.append("for video in videoTimeLine :");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("videoListAfterSetStart.append(video.set_start(timer))");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("timer += video.duration");
    _builder.newLine();
    _builder.append("result = CompositeVideoClip(videoListAfterSetStart) # Overlay text on video");
    _builder.newLine();
    _builder.append("result.write_videofile(\"�movie.title�.mp4\",fps=25) # Many options...");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence declare(final VideoElement v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("�switch v {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Video: declare(v as Video)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Clip: declare(v as Clip)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Title: declare(v as Title)");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("}�");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence declare(final Video video) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("video_�video.name� = VideoFileClip(\"�video.path�\")");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence declare(final Clip clip) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("clip_�clip.name� = video_�clip.video.name�.subclip(�clip.startCut�,�clip.endCut�)");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence declare(final Title title) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("title_�title.name�  =(TextClip(\"�title.textarea.text�\",fontsize=70,color=\'white\',bg_color=\'black\')");
    _builder.newLine();
    _builder.append("             ");
    _builder.append(".set_position(\'center\')");
    _builder.newLine();
    _builder.append("             ");
    _builder.append(".set_duration(10) )");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence declare(final VideoTimeLine v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("videoTimeLine = []");
    _builder.newLine();
    _builder.append("�FOR VideoElement videoelement : v.videos�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("videoTimeLine.append(�getVarNameFromType(videoelement)�)");
    _builder.newLine();
    _builder.append("�ENDFOR�");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getVarNameFromType(final VideoElement v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("�switch v {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Video: return \'video_\'+v.name");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Clip: return \'clip_\'+v.name");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Title: return \'title_\'+v.name");
    _builder.newLine();
    _builder.append("\t\t\t  ");
    _builder.append("}�");
    _builder.newLine();
    return _builder;
  }
}
