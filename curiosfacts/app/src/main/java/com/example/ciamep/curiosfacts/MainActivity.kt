package com.example.ciamep.curiosfacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.ciamep.curiosfacts.model.Fact
import com.example.ciamep.curiosfacts.ui.theme.CuriousFactsAppTheme
import com.example.ciamep.curiosfacts.ui.theme.FactListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Lista de 30 datos curiosos
        val facts = listOf(
            Fact(1, "¿Por qué los flamencos son rosados?", "Obtienen su color por los carotenoides presentes en los camarones y algas que consumen.", R.drawable.fact1),
            Fact(2, "La miel nunca caduca", "Gracias a su baja humedad y alta acidez, puede conservarse durante siglos sin echarse a perder.", R.drawable.fact2),
            Fact(3, "Tiburones más antiguos que los árboles", "Existen desde hace más de 400 millones de años, antes de que surgieran los árboles.", R.drawable.fact3),
            Fact(4, "El corazón de la ballena azul", "Es tan grande que una persona podría nadar a través de sus arterias.", R.drawable.fact4),
            Fact(5, "La Torre Eiffel crece", "En verano puede alargarse hasta 15 cm debido a la expansión térmica del metal.", R.drawable.fact5),
            Fact(6, "Las abejas tienen cinco ojos", "Dos compuestos y tres simples, ideales para detectar la luz ultravioleta.", R.drawable.fact6),
            Fact(7, "Venus gira al revés", "Es el único planeta que rota en sentido horario, contrario a la mayoría.", R.drawable.fact7),
            Fact(8, "La velocidad de un parpadeo", "Un parpadeo dura entre 100 y 150 milisegundos.", R.drawable.fact8),
            Fact(9, "El sonido en el agua", "Viaja casi cinco veces más rápido que en el aire.", R.drawable.fact9),
            Fact(10, "¿Sabías que los plátanos son bayas?", "Botánicamente, cumplen con los criterios para ser considerados bayas.", R.drawable.fact10),
            Fact(11, "El chocolate fue dinero", "En la antigüedad, las semillas de cacao se usaban como moneda en Mesoamérica.", R.drawable.fact11),
            Fact(12, "El pulpo tiene tres corazones", "Dos bombean sangre a las branquias y uno al resto del cuerpo.", R.drawable.fact12),
            Fact(13, "El Monte Everest sigue creciendo", "Aumenta unos 4 mm por año debido al choque de placas tectónicas.", R.drawable.fact13),
            Fact(14, "¿A qué huele la Luna?", "Los astronautas compararon el olor del polvo lunar con el de la pólvora quemada.", R.drawable.fact14),
            Fact(15, "Huellas dactilares de koala", "Son tan similares a las humanas que pueden confundir a los expertos forenses.", R.drawable.fact15),
            Fact(16, "El agua caliente puede congelarse más rápido", "Es el efecto Mpemba, un fenómeno aún no del todo comprendido.", R.drawable.fact16),
            Fact(17, "Tu cerebro trabaja más mientras duermes", "Durante el sueño REM, la actividad cerebral aumenta notablemente.", R.drawable.fact17),
            Fact(18, "La jirafa no tiene cuerdas vocales", "Puede emitir sonidos, pero muchos están fuera del rango auditivo humano.", R.drawable.fact18),
            Fact(19, "ADN compartido con los plátanos", "Compartimos aproximadamente un 60% de nuestro ADN con los plátanos.", R.drawable.fact19),
            Fact(20, "Las mariposas saborean con los pies", "Tienen sensores gustativos en sus patas para identificar plantas.", R.drawable.fact20),
            Fact(21, "Los canguros no caminan hacia atrás", "Su estructura corporal y su gran cola lo hacen imposible.", R.drawable.fact21),
            Fact(22, "La abeja reina vive mucho más", "Puede vivir hasta 5 años, mientras que las obreras viven apenas unos meses.", R.drawable.fact22),
            Fact(23, "Lluvia de diamantes en Júpiter", "Se cree que las presiones extremas convierten el carbono en diamantes.", R.drawable.fact23),
            Fact(24, "Koalas dormilones", "Duermen hasta 18 horas al día para conservar energía por su dieta de eucalipto.", R.drawable.fact24),
            Fact(25, "La Estatua de la Libertad se mueve", "Puede oscilar hasta 7 cm con fuertes vientos.", R.drawable.fact25),
            Fact(26, "Ojo humano: un detector de colores", "Puede distinguir hasta 10 millones de tonalidades diferentes.", R.drawable.fact26),
            Fact(27, "Murciélagos con giro preferido", "Tienden a girar siempre a la izquierda al salir de una cueva.", R.drawable.fact27),
            Fact(28, "La Vía Láctea es (casi) plana", "Tiene un diámetro de 100.000 años luz y solo 1.000 de grosor, con un centro abultado como una tortita con nata.", R.drawable.fact28),
            Fact(29, "La velocidad del guepardo", "Alcanza hasta 120 km/h en sprints cortos de pocos segundos.", R.drawable.fact29),
            Fact(30, "¿Qué son las estrellas fugaces?", "En realidad, son pequeños granos de polvo que se queman en la atmósfera al entrar.", R.drawable.fact30)
        )

        setContent {
            CuriousFactsAppTheme {
                FactListScreen(facts)
            }
        }
    }
}