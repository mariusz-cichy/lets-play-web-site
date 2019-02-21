String template = new File("${project.basedir}/src/main/docker/DockerfileTemplate".toString()).getText()

def dockerFileText = new groovy.text.SimpleTemplateEngine().createTemplate(template)
        .make([fileName: project.build.finalName])

String directory = "${project.basedir}/target/dockerfile"
println "Creating directory: " + directory
new File(directory).mkdirs()


String filename = "${project.basedir}/target/dockerfile/Dockerfile"
println "Writing to file: " + filename
File dockerFile = new File(filename)

println "File content: "
println dockerFileText

dockerFile.withWriter('UTF-8') { writer ->
    writer.write(dockerFileText)
}