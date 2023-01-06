import static org.lwjgl.glfw.GLFW.*;
import org.lwjgl.opengl.GL;
import static org.lwjgl.opengl.GL11.*;

public class Main {
    public Main(){
        glfwInit();
        long win = glfwCreateWindow(500, 500, "teste",0,0);

        glfwMakeContextCurrent(win);
        GL.createCapabilities();


        glfwShowWindow(win);
        while(!glfwWindowShouldClose(win)){
            glfwSwapBuffers(win);
            glfwPollEvents();
            glClear(GL_COLOR_BUFFER_BIT);
            glBegin(GL_QUADS);
                glColor4f(1,0,0,0);
                glVertex2d(-0.5f, 0.5f);
                glColor4f(0,1,0,0);
                glVertex2d(0.5f, 0.5);
                glColor4f(0,0,1,0);
                glVertex2d(0.5f, -0.5f);
                glColor4f(1,1,0,0);
                glVertex2d(-0.5f, -0.5f);
            glEnd();
        }
        glfwTerminate();
    }

    public static void main(String[] args) {
        new Main();
    }
}