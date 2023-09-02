package net.kdt.pojavview.value.launcherprofiles;

import androidx.annotation.Keep;

@Keep
public class MinecraftProfile {
	public String version;
	public String time;
	public String gameDir;
	public String javaDir;
	public String jvmVersion;
	public String mainclass;
	public String classpath;
	public boolean v2;
	public String[] jvmArgs;
	public String[] gameArgs;
	public String logConfig;
	public boolean logConfigIsXML;
	public String pojavRendererName;
	public String controlFile;
}
