package com.example.jogos.repository;


import com.example.jogos.model.Jogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    @Autowired
     public List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados(){
        this.jogos.add(new Jogo(1,
                "Mortal Kombat","Jogo muito bom",
                "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxISEhUSEhIVFhUWFxcVFhUVFRUXGBcWFRYXGBcWFxYZHSggGBolHhUYITElJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGxAQGy8mICYtMDI1MC8tLS8tLS8tLS8vLS8tLy0tLS0tLS0tLS0vLS0tLS0tLS0vLS0tLS0tLS0tLf/AABEIAQMAwgMBIgACEQEDEQH/xAAcAAABBQEBAQAAAAAAAAAAAAAAAQIDBgcEBQj/xABGEAACAQIEAwYEAwUGBAQHAAABAhEAAwQSITEFBkETIlFhcYEHMpGhFEKxI1KS0fAzYnKCosEVFkPCstLh8RckNFNUY3P/xAAaAQACAwEBAAAAAAAAAAAAAAAABAEDBQIG/8QANBEAAQMBBQUIAgICAwEAAAAAAQACEQMEEiExQVFhcYHwBRORobHB0eEi8SMyQlIUYsIz/9oADAMBAAIRAxEAPwDaZpJoooQkpaWihCSloooQiiiihCKKKKEIooooQiiiihCWikooQlopKKEJaJoooQlmlmm0UITqKbSzQhLRRNFCEyiiihCKKKKEIooooQiiiihCKKKKEIooika4BuQPUiiUQlopouqfzD6ipIolEFNooooQiiiihCKKKKEIpaSloQiiiihCKKKKEJKKKKEIooooQiiiufH463YQ3LrBVH1J8AOpqQCTAQTGJXRXm8S49hrEi5dUMPyDvN/Cuo96ovMHOV29K2SbaeR7zerdPQVUzWnQ7NLhNQxuGay7R2iGYUxO85deCvuP+Im4sWJ/vO3/AGr/AOavAxfOGNuf9XIPBFC/fVvvXghaeE289vP0rQZZaLMmjnj6rMqW2s/N3hh6Y+alv426/wA912/xMW/U1zFPKvawnLWLufJYaPEjIP8AVE16S8i4r8xtL/ic/wCwNdG0UmYXgOa4FmrVMbhPEe5+VUwo8B9ans4h0+VmX/CxH6Vcf/h5diRiUP8AlaPrNc1/kLFDY229GYH/AFAD71x/zKLsL464rr/hWhuIYfL2K8rCc04y0dL7MPBu8PTvSR7GrFw/4idL1kAfvWz/ANp/81VvFcu4q0Jew4A3IGYDzJEgV5NBoUKwm6DvHyPtAtVooGCSNx+/aFsfCuYMNiNLV0Zv3GlT7A7+016lYQVqw8F5uxGHhWPa2/3WOoH91tx7yKRrdma0zyPz+loUO1QcKojePj4ngtWoryuDcfsYofs3hutttGHjp+YeYmvVrMcxzDdcIK1mva8XmmQiiiiuV0looooQkooooQiiiihCKKK83mDi64W0XOrHRF8T/IVLWlxDRmUb03j/AB23hEltXPyoNz5nwFZbxji9zEXM9wz4Doo8AOlMxuOa/ca5dcyepE+0dBUuEwBd2t5ZiDI3Mxt5wR9K3rPZWUBLv7dZLGrWh9oddp/1nDfx2TBheY28V7XBOWr+IMqkLsXbRfr19qvfA+UbNoBnUO0DQgQD4nST6HarKojQCANgKWrdpYRTHM/Cup9mAGahncMvHVVLhvIlhNbrFz4Dur/M/avd4Zbw6z+HFvTQsgBEjcFxufKZqr848Se5c/DglbSwLmXQtMEg+QB28Z8quti0qKFQAKBCgbAdIpOuKlxrqjiS7TSPvopizvZfcym0AN9d24bTyVe5x4+cMgS3/a3AYP7qj80dT0HofCm8r8JRrKX747W5ckzc78AkwAG8hM+deBz3aLYnXoqgem/6k1L/AM628Dw/PcRna1lRUEDNmMKZ8tAfamX0+7sjXU8ziYzj4/aUZWD7Y5tQ4DBoOU4eZ60V8tWEX5VVZ3ygD9KkivE5N5iXiGETFKhQMWUoTJBRip16jSvbBrMmVrRCSuDHcGsXp7SyjE9Yhv4hB+9ehS1LXFpkZqHNDhByVG4nyAupw9wg/uPqPQMBI9wapWP4dcsvkuoUbz2I8VOzD0rbK5sfgbd5Cl1Aynoeh8QdwfMU/R7Qe3B+I8/g8/FZto7MpvE0/wAT5fXLwWJqSCCCQRqCDBB8Qav3KvOWciziSA2y3dg3k3gfPb0ry+ZeTrlgG5Zm5bGpH5kHmBuPMfTrVQY1qObStdPOd+o62arIa+vYquIjdoetuniFvFLVF5F5onLhb7d7a0x6+CMf0PXbwm9VgVqLqTy137XpKFdlZl9v63dcRgiiiiqlciikooQiikmgUIUeKxKWka5cbKqiSTWO8y8bfE3mYnuyQg2hZ0EeNWL4kccBP4ZDKrq56Fh+XziR7mqMgmI3rd7MswDe9dmcuH36cVjdp2kz3LOfx7711YHDtdYIoJJMaVsfA+ErYtoDBcKAWjUabA/b2rx+ROBdha7Vx32mJGyzofU1appPtC1d6643IeacsNm7lku/sc925Popk1z43Fi2snU9B4n+VZ4BJgJxzg0SclTeZLBXEP4NBHmCP5gj2rq4dxm9bQJ3WA0GYGQOgkHakxQa6xdzJ+wHgPKojha1oBYGvEwvP3y2o59MkTPmuHj+Na4HvOolE2UESJ7o69WiapWJtPiCWdMQE0XKt8W7Rgj8sidfGavXFEQWLiu/Z5hAYCSIBbRYM9BHWdwYrIeabl7teze6QAdiQsjowUkkSIP0rLtdoHed0f6iMPP4zW/2bYalSj/yGtlxJx1wgYc845jJXPhOPvcPLHDreCg5jZdi1sjSRAMLPQr/ADrQeV+OC5ce20qLrdtazf8A7O8V9dZHv5VhXLeOvNcyC4Z1OaGYBANTlMHp961HE2FATI05VAzbHMBM+RgqY6eNRZXNfUNI6g+IiPcc1PaFOrQpCsRk6NMQQQR6fa06aJqq8G5n0CYjfYXBsfUDY+Y+1WdLgYAggg7EGQfQ11UpupmHfSrpVmVRLT8p80lJNE1WrUtZ/wA7cqxmxOHXTe5bHTxYDw8R71f5pCauoV3UXXm/tU16DK7Ljv1v6zWD1qPJfHziLeS4Zu2xud2XYH1Gx9QeteHzhysFbtrC91j3kGsMToY8CenQ+ulf4biHsutxDDKZ8j0IPkRp71tVRTtdGW56bjv64Lz9N1Sw14dlrvG0bx8hbEGp0153D8ct22txdmEx4HqD5gyPauntKwCCDBXpQQRIU80VB2lFQpU1cXGuIjD2Ll0icg0Gu50E+VdWaqH8XOJBLFu1pmLC5HpIkDrH8vGumML3Bg1P78pXTS0fk7IYnl85KiMWfvsSxZmYtO5JltT1nerPyFwbtr4doy24YjxjYfWqRwS6z5kJkzmHqd/9q2rkzhosYVTEPc7zHy/L/P3rftlXubPAzOHXJYtnYa1qNQjAY89PnwVhLVBbvy7r+6F/1SZ/rwpc1eXxIMtwXFJE6SPETof66VhUmBxu+Hr6StKvUNNt+MAceGX3yXsNcABJ6V4b3WZixG8gA6wDpp4HWnds7aMZ+n+1SCzTNOn3eazrRaTVi7gAoksU9rNSpbaa6Mk6nWunPxSwaq5xXh6u1osFKq5JVvzHIzII695VMeANZ9xbgVq5fU53vXLrFWtKmQW4GjC4sAgAbFdP19n4j8cyYrD2re+HuW8TcUbtDDuDx7rEf5j4VPisclrNicOVdGQlYDRluAiQw0BmIzeJrCtbwapcNfYL1vZYeyi0a6cycNuvmq9y9wy0l/Pne3cS4bRwty2WV1ETnuMSNfADwjxq/wDCeBq2dO0yhGbIurEJMLqT4AfUVWcHjrfaHF38gy5X7OG7zwBbAL6EmOmk0zlTiZe2Vz/tbJ7xWQe+WOaf8Qb6iu+z/wAq+BjDA78Psc1x2w49zLgXCRIk5Y4DgYPurNxHgdy0M3zL1IG3qOlcmDxty0ZtuR4jcH1B0qa3xy+CJuEjwMa+8VxuwOZiQDuFHWT08AP5V6Fl6IfBXkqhYHA0pHtwMqyYXmbQm4g010aCfRTv9a9zDYgXFDgEA/vAg/Q1nuAx6W7qs65lB1G/oQPEVoVq8HUMplWEgjqDSdpptYRdGfgtOwVn1Qb7pjSMePBSzSMaZNGalVoJl2CCDsdKzjmrh5w9zSMjyUjptIPof1FaJcNeZxrALiLZQjvboeofw9Dt9PCmbLX7mpJy1+eXpKUttn7+kWjMZddYwqzyXxIpcNhjKPqnkwHT/EB9QKuuesexXEGsOMp76ERI2KnqPVa1fC4lbiLcX5XVXHowkfrV/aDAHh419R9eio7Mee7NN3+J8jpyPsuvNRXPNFZ60l3g1ivxPxou4942t5bY36KCY8pJ+praFYDU7AEn0AmvnXGYk3Lj3DuxLE+ZM71odmsmqXbB5n6BSlvqXaN3afIY+sKz/DfhBu4lHhWCtDhge6CrEEdCdPbStmciYGw0HoKyz4RWwcQ5InLbL+hHdB9Ycj3Nae7a1TbyTaDO5XWYAUWwEs1xca4jZsWi99gEkL5ljsAN56+xrqBrKfibxI3cULIPcsgDyzuAzH2GUexrizUu8qAc1zaavd0yVccBzLhG07SNdirT7wKsVrYHodjNYdgWyA+Y28//AGk1c+B4rFXrfZNcKjKywRGhGkka5QP9xT1eld/KcN6xmEkxC9viXNPeNvDrmO2feT1yqN/WuC8byzcu3HU6QJ75JiAQD3B6/SvK4jxKzY0RnKA5GyFUJYaNn0zT7/m2giu27etXMK922CAuVwWkwFYHMrE+G9ZNS1ucP4hA2nFx5ZDwPCRht0uzWMcDWdeP+owA4nM+Syzma7cxOMN+2zZmYlWnoNBPsPtXJguM4jCNcsG23ZsxYWzmUr3iZRugMRpoYqzYbghuM9ywumeQu0F5g6/l2PowNd/OHLq58OZdXK28OpJQq3zAOZOpmTAIJmkniQWuGELVpuAILc/pUu7xC/i7hWMvZrKLOklgCzN+ZoMSelWrkq9ZtXnXPNx1KNJgEyrTOu5Q/WnWeWrS2sisWxDd7r8isquANgJZen5a6rvK1uxZS7obk5W3iGOQHXopM1LPxIu4RGSKrWum/jOc7CtO4VbwjqMqDNqCHgtK779PMaVLjeBWLggLkPRl0j22NUDh9+0loWmdwyzDgxod9Dp9as3KHHu0JR7wfMTkJBBkb/mMjp02phtqqNxc7nj4kZfGxJvsdFwhrRwj0KrPGMFcw9zs7nqrDZh4j/cdPvTeG8z3MKTkIZSZKNqD5j90+Y+9aFx3hNvFWjbfQ7o43VvEeI8R1rHOK4V7FxrNwQymD4EdGB6gjWtyjWZWZdcMdflefq2V1nqXmExptG7rPUStHwXxGwrf2yvaPUxnX2K97/TVk4fxaxfE2byP5KwJHqu49xWAtcE6iROomJHhPT1p/EbdlSr2LrNMnK6lblsjxYd1vIqfYUtVs7Afxkea0KVd5H5fC+g2qFzEfWqH8LcTirq3WuXneypCKrnMc8SYY6gAEaT1HveHNJvbdMJtpkSsr+ImB7C+X1K3RnXylu8J8jIjzFXXkbE58Iimc1uUIO8HvofTKwj0qbm3hIxOG2k2ySNtmAB/QU7ltYsoSIJRVIj/AO0WUH+EoPRRUG0XmCmcwfKMPLzXbbKBNYa4c9fletS02KKhcrm5pxPZ4LEv17MqPVyE/wC6sIKz0raeewTgMRHghPoLqE/asaWtXs0gNcd/XqsvtIm80aYrUPhGT2N/wGWP824/0j61dSaqPwzcfhroCwQwMzvmI3Hll+9WnNpvWdWM1XHetNuDGjcPRSTWL86ORj8QDvnBHoUUj7RWwhqzL4ncNy3xiZEXAqx1zKpBP0VfqKvsTgKkHUJW2NJpzsKrtm5prtv71Y+Ds9u1cvi3nXKVVe+Q2bQnKikkDadBqddKpiuRV+xViyrWlvuXF1ZS1B/ZouQ5URTEgOqnQnTY61d2i+KYZo7M7hHr6SqezaANU1D/AI4gb8Y8I9FVrllbgOS4BPdyXGIYZflQswAuATCkhSNtdqg4VzLcTDXbFzswsG3mc5XTWJI/Oo8tfOroeHYLvrBTvDvKxE5pIU28hBBOaO7BiF6VlnN1hrN65aUghmDQDMLMAN0DdyYE79ayIC1zOqtfL/GrWEfsnv5w5DBuztoAxAkSp859epqwcUxy38ThAO8qEsJ6soZp9gkj1rM8Hi1J7J0zl3gDbWSq69N60zky+l3FNh0QgWLThSepVGtGfXOPpsKVtTzTpl2z5Ccs129Lt/oVJwZ7aoAHbN3u4x27wBkHUQdPCuzHvnwzIRMqwnTfWIO3hTThHst2jDMr5+gFxZeSCOo/qK83ifEFFpsrfLqRsQCY1B1HvVFK0tcITFez4lwVCxPE2UsoYszkazsDply+8AabTVo4MLguJ2YggjMQJyDrMfmjQL0kk+VSwDI+OAMAEhtfE6EaGfmOw18OlameAtdQouW0gjNnZc9w66FVYKiiBCkkeK05dL0lNzxXr4TnFFxDYfFRblj2N7/pXEJkDNsGE5T0kHbaoviNw6zcw5xDGLluAjKJz5mACEdQSZHhr5g1/j3AG/ClVZ7xtsrIDbgpmKqRbgSUIHyxEqD0mqdhuOYnDxbW6yhWDC28MqsuohHBAI9K0rKwkBwzbgd+/mM9/BZdqcGm4ciJG79Hyhd2L5axltczYe5ljNIAaBE94LJWOsxXnYLhd+8Ga1ae4E+Yos5dJ1jyFepd584gwjtwPS1a1/015vAuM3sJdF2yY/eX8rqDqpG3v0po95BmJ5qloZpK0n4ToRg3JiGvMV/gtqfuKt7CuLgBsHDo+GXLbuTcAHQ3GLMPIhiRHSI6V2uaQeZcSm2iAAltEagnRgVPv1rz+D28i3LRmbd1116jukH0O/vXYaisW4uXDHzC2fU5WX/tFUlv5h3WqZY/+JzOB8CB6EqeaKSaKsVC4uZ1zYTEgR/Y3On7q5tvHSsR06D23rdL4DqUOzKVPowIP2NYXetsjNbb5kYo3qpIP6U/YTF7l16LO7QBN3n7LUfhcs2MQ+cakA2wPlgSGHrJHtVoY1RPhLxOHuYZjpcWV8mUGft+lXZzFJ1hFVw3+UJ6j/8AJp3e5VX4ZztaVTbxhNm/b7twMrEMR+ZSo66GPPSRVK5z5jGMur2YIt2wQmbQksRmYjpMAAeXnWkcT4Vh75m7aRyBEka+mYa1S+feG2bNm12VpEGcglRqe6Yk7nY1fRfTD5Ax8gqKrX3IJwHiVXuAYE4jEWrQ2dhmPgo1Y/wg1q+IRFKP2hGXNlVMsgnWGO43UkadPbJeXse1q8GRlVjADN8o7yMZ10kKR716PHsTj8NiHu4Rg6XmBLhVulnzSvagrAYHQMB00aartbpeCcgMOZx9B66q6xM/jIbmTjyy9Sr8cQl+zeU3WkPcTMrd9Ht/MUI7wXY+BEE6HXPuI8m2rjdqcf3gFU5rUjuqAo+cQQAD1qTjHMeMZLidkbSXVKhba/tZ7uU3QPlXIFEA6d35oNVT8NiWhipCIPzEIseZYjU0k6oyf7DxThY+MsF6V7glrBk3WxSXXQyqC2RnLgj5sxiCcw3+U7b1e/g3w1puYl5OZcikQANZIEVQeA8IOJu5SQQO8crZ9Br+Wf56+42zlfG2xaFmxaYBe6gYRmczM+GxJ3IANZtvr3oos1I+QOZCvZRe2kahH1pPspuIYPMCoC55lgCe7+76SCfWKzLmG0GJQiCZ8CPY1p/MGLTB2b9xm1FoGdi1xmuAfUlQPDQdKxj/AJxR1U4vDLcOdoKNcQ7CGChgN9IpalZHsrEA5RtzInrbnhMK+na/4yHDrmoeX+DXvxB7KZFu7IXdlyzlUnQsSBA8RMEAir/ysz3rRu3O2STbK21JyhYkkOygWwcwaJLAQFIiB4GF5+wVsDsrDKfEJs0RvvsT9a6+Ac83cTiuzS0QkMe8NgPln1aBHnW2xrsA5JPqNE3QrthMCLb9qBcgKQwBVl1iW0UE6DQ+E6CvQu2Ef5lVvMgNI8RNURuZhahTcRcQ7kWbLEarmYYd7gTRP2eTQwSTECauWB4hauN2S3EFxe6bRaD3THdJ+YaaQZiKsgNPXXFVG85P/wCEYbN/9PZnx7JJ/SvL544St/B3AFGa0DcSBtkEsB6rIj08K96+CNwRG9ROQQQdiII8qsDjMqojRVD4V8QmzcsEz2bZlHgtzcD/ADAn/NV3NZRyzf8AwONa25he9aYnaJBRz5aD2atUtvpVtdsOnauKTpbwT2oEe8QfQSR92P2qHHYoKAPzOQqDqSdzHUAST5A04vVMaqyVJRUWaihC4RfNZrz5gCuK7QfLeUN/mXuuPXQMf8daEprzufeEdrYzW91HaqPKIur7Dvf5BXdGt3dQb1XXompSIGYx8PqVnvCMPibf/wA1ZRytky1xVMIRBhj00P0NbDcxq3F7ZMxRkF2VVmADCTJAMQQw9qr/AMK7CNhcXbuHuOVtt6XEyR/q+9e1ytw18Lw82bpm6CXceAN1gkeAISfc1baDedJ0w9/L3VVmltMDnw/aYyu2q27hB6i3cIPmCF1FeVxTh/4lHw7JcJEE5bb5kOuVojQ6Hfevdxp7vD/RP/FYroyk4jGgbm3AkxqbSdelUgQrjjgVh3FeWcXh7i22sXCXbLbYW2AuHoAD+by/21qb/lPiX/4d7+A1rfFLEYexauHvDtGKq+uVmOUyp2g9PDyqt822jh+CBLdy53cTozOxeGd2gvuQJj0Aq8VjklnWdoBOiz3A8NxV53tW7Lu9slbiAEshBKkMvSCINdPfvWLaKixbfsguSTcuux2YEaxlXr99bl8J8SuHsXsdiCxN/EWMKjMe8S7KGbMdxNwE/wD8zXhcd4ecJi0w4MKMeHUAnS3cuWiixt8sbeVKWwl10f8AYehnyw5pjs+iGuLx/q7684KreLd8DfC3bd2xcEXFAyo43AYZj6jUQRIIg1s3KnM9m/dti3dS5nzKDs4VbXaNKgAK0hZ8sogRJzD43BP+KPmUH9la9flNdPwTRfxukQHGkv8AMbGJ1GbyBB9qTfQaKragzGHIwOR9pGsjSEvpYxruOE/HpsV2+L16yo/bM+R0t28qBTJ7R3nvER/ZkT51n2FW1bw5xYwDPhwMovXDmHzZZzghZnTaemtWb4/2gexYxpkABnUntvA+Xrt516Hw04FbxvBbdi7/AGf4ou4j5hbcNk16MQAfImpFnZUqVC4nMax/i1cl7mUmEdfk74VbxTtZtWVThwU3rkI7W5Dhx3EtgEM7EwZ10qe1huKW1YLg7ltSO92dt7c5dRmKEExJ603FcTfE8cs9snZtZxSWbdr9xEuDLEad4Q0jfMOgFXrhVx/+M8QUk5OxUqJMf2didNup+ppqhZKFMEhoJEmTnn8JKrXqvcPyIB0BwyWY5MRbAxYsBA+i4gISSSCO7cJJU6ESpB0iuW/gcQbf4pkfspjtYOUnNlPeO5zSPUGtP4Vw7teBCzHfPbNbA3a5bvXLgVfMhCPrT+cuFhOFWcMhBNt7aMemdUbOfrJp1jmU8AAMfLb1KVIq1PyLiTAOc4qPlLiGNZFsYuxfKR3L5R2I6gNAOYdJ869K++UxrqcogMSSTEREzJjao2w4NzhTdutvLaX9mS83JS3osCDt18a7sNjFvX7llxDWb+edP7ITcmfDOB/EKVfDSCBmU4CXAzoOvVUrm3gj3Li3LVp2fRLiBGDnQlWAI1MAg+AC124XgmPtALZv3MnQPZud0eGUo0egNWTiTpdNu9EC4plZ2dJtuGjQ/NH+WosRhz+GsKj5cr3fmGcEB2AU5j5776UwKpuhvrBS7qYm97x7hQ8L4b2Z7W5cN26R852VT+VB0Fd2auXDyqhSZgRIBG3qxJ+tdSmqHEkyrmgAQE6ijsv6mioUrzBbMaV6KODZOYTk1P8AgOhMeU6+RNMNuNBEfSpMJcyNqJU6MPI71VVaXNwzV1J112Ko1nH2sFYx2DLOt24ZskKSIyzbfMNBOn0rtwvO6uuMd8y3bwQWVy5gvZWwBm1+UvmPvXJ8QuDG2yMsm3HcP9ySQnsSd/3qo74g6iPrTlE99TnXXj0FTaaRo1Px/qcRw+sjvWw4PiFrE2cNcAdexyhgAjd5TbJWc4I+TQnodqkOPBu4pijgXkyJ8u+QISe9pqs+9UTkrFGy47wK3B30LZQQOoJ0zD1+01oD4NWAe2cyNqCPuD4Gle9AeWJipZXMYHnXrTrmCvPN7NYVGVs9vW2Rl+Rt7THN0O3TRR40Y5FvYM4ZrbmXYmMmzBlBBLbjMG9q6Vw3lUfFMSLFi5eP5FLep/KPUkge9WSliBqs+xnOZwuBwuE4ffdblvP+Ic21lrh1OXtARGYv56LXZzXxKzicRg8WM+gstd7hgFSr9ov7wI0jT5V8dKve5TxgFlntEdsVEgElS7QO0H5DrOv66VYec+K9jdFiyFhEVGBAIECAvqBFUV6sPaxoBmTwj7U2FpcHufIAgDmNhGyEnOV3hOPxLYq5fxIJVV7NcONcggAOx0J8xFS/BvDBMQgHR2aDrAew40PlkH8VUrFYx3iQN+gFX/4UAi7aPVrsH0GHxR/XLVdV03ZH+Q9YTdIXb93/AFKk+P8AhS/YFR8u+3iwG58z9KrWB5jSzwX8El25bxQvLeVhbuZRlvK4GdQRIyhvCQKu/wAZMXZW13jJXIsTs+fMFjqcrFomQF2M6ZGOJL+WPYBT9dD96ljiHvjb/wCWrlxDqbBu/wDRV645xvD3r2C4mUdL1p7JxaKndbIwOdCTuAG0O4y693X3MPztw5MXiMWt/EOb1vKLJswFIW2vdYnr2Y38apfAMI+JVreYCVYiIaTlICnpGYgnf2qs5QD4eWx+lW2eqKpc05j3VVelchwyPl1itX4JzPaTA4VUzm5Yvdq6gflJuZkDE75bsVBxPmmy+A7Ise37Zr7AwBL3LjQGJ/vz7RWb4G86NKHfQ+B9fCpb2QtLNr1BB08tP9qfLGuzKVxacFqbc1YBmwjG8+bDqoKraDZyAo3zaar4da7OB8zWGbFYoArmZQuYorG2WAZ4ZtydIExlWd6yV7ZZwQMu3tG2ntXocNxVxMyZQ4beRqCes/eDI0FcVqBDJbnv6iU3ZXMc65UJAOGHEHwwWz8YvaFIdodXtGUgoUAInNMSWOvgPWuNr82bVvI2ZS5MlI75LbhjtoK67lkmzhj17C3t/hFQsm1KMqXmglD6NwncorEnce3hXbbSobK612qortVqPs/60panyUUIXO9qkNmu0rPSmlKhSor2CS/ZNi5sflPVW6ET/X1rGeZeDnC3GtvoQfOGHRlPgfCtrtp1rj5o5dXHWMui3B8jkf6W8j9vsYY40n3m8wmWOY9nd1MtD/qdvA/5eMLGeGEO62gVOb82spPXwOg1Gu3Q1eeVeKnC3OwuH9m658pMlT4/3dNdap54FctOy6JctyHDSWMdY22211G01IBdFxxcHfMNqQSYg5iAe70Pe8t6te2naP6u+Z0I5eWeqtJqWdpp1GzOuYiNDx+sAtgXJcQXbRlG2P8APwrkvYRWKlhOUyAdgw2aPEdD0qi8G5ifCArJuFiCwPyx4DxP0Hr0vPB+PYfFjuns3/cciD6Gqyx7P7DDbp9JR11x/E/I4/UoxxyIzT0P3rF+MOHvXDuMzR9Y3rWef7hsYO45nQqCNtGOUn2Bn2rDzjLR1zFSejA/qJH3pa4TWc47APdW3rtIDaSfZS3CJAFWfl3mD8KgKsga273GZ9kV7LW1eJ75k/KIkwCRM1VVKgZ5BCgkkGdAJ6V4vEXFy5mU90ADbY69D61NSnfAEwQZBgHHn+toIwXLKgYSSJEEeI69F6HMHHbmKeXLFQSUBMnUzmboXMyT4k9NK8xlBAjeo3tsDlbf9R4ipbdrrV7Gta0BuXXiTqTiSuHuc5xLuutF6nLfGLuFuh4LJMNH96QPuRXZzJk/EF0PcugXVHUZ9x5QwYe1eZwzFm3dBMFSMpB2PXb2rv5xsZMSyknKDAMbKVVxm/jqlkMtN6Mx48tysLS+gcciPPBcaMRsfXwPqKntKCRnDEbQDB9pBrit41QJRe/sJJECPmEbVauG31s2kv4i9CtLpYtOHvXQ0Rm1K2E0Mlu8dYANMutB0b7fKVbTKn4NhnvuqW7LnujPrOpkZgDqBII3PtVhHBUtE9petrdH/ST9rcHhmCSLfqTWe2+P3g79m72gwIHZOytBJIVnkFxDEa9dd6974WcOfEYtFCEIji6zdAF1y7bkhf6Jqm02is2kbkTpOOJyE5dBaFioMNW+8wBJPITyW53UC2bSnRltoMvhoARNcOWvVx1vM01ydlRTYAICXe4nPVQWretdKLSqlSqlWKpJRT8vlS1K5TitGQVIRQBQpUQWprRjrRlpYqIUyuDjnBLeJAPyuuzeI/dby/Ss149w0Wb37VHUx87aK7HTTL83XbaZOta2BUeMwlq+nZ3ba3F8HUMJGxg9aodRh19hg9efWeKcpWxzWd0/8m7NnDdulYbxTDtbuKGuIFfUFhcPdGhbMFgjTxBGg86ra8yNbd+yJK7BrioWA6sq/KD4Tm6VtfMPJNp7LrZGQQSiKAcr7zbJIykwBH9DDeO4C7afIbLq5KlnuABiWiAMwEa6HzHSrKNtcf4qxgjhjwwGWw4jXNRUslN38tAa75HqfCfmwtzBicVw3FG68p2oVAWZiIUsw7xMCblsACKogeUBq0X7jJglRgSbgvXWJMnOLipqepy2aprGIHn9v6NcUIDnAZThwyVlqYe6aTnrpnB0XROlPvNFtAYksST9gPpr70y0M0DTWjFXtBoYltjGgCgV1UzACTAwKL8kLc6EAe66H9PvTxcroQE2VUeLMJEabsPvPtUFkCTO0V1SyUOS2NGXyYfWatvO1vPcsOoB7WzbOswTBQz4adnrVQJgzPUH7zVq4mBewiOP+g6A7wEvKoPpDBPvS1p/u09Y/cJ6zNmg5u34XAeEWkA7UEEkgQFG2nzCQfLSSTUOMw+dkS2pmMoWBOkAfLvoN6bi7b3DDSQo1CqSBGhZsogAede1yjw7FmSl1AIIVWdSHO+QqAZEmYbTSa478UG36jutwVbKD6joaOvBeVa4Fc7UWiVzEAwjKzDXqJEEDXWOmuor6B5J5ftYTDpkU52UF2aQWbYtlOg0A6AxvNeRyJyQmGHbXM2Zp7p3YNBm4DsZB66jfczeHueftU0i+u4VHiBoNeO7dtBnBdV3MY3umGdp04e88FFcJNR5aedTQacASZKYFp4FAFOAqVwkiinUVKE4iiKdFJFChEUUtJFCEUURTqFIQrkVycS4VYxChb1tHjbMsx4x1A966QKa2uniI9jVb6bXiHDBdhxabzTB3LCvimqW7/ZIoRVzZVAIGUrEjxEmazi/bq5c/cvNgby21v8AbLqFLDvoCQ0ONp7240MzAmqg6yOoP2pekCwDctaO9pEbQPT3EdBNtKVEnpUbkrly75SdgdyehHlXTgMNcu3EtW9WdggB6sxgfc1tp+EFsZAuIlVAEMkExvLK1ducZmJ4JBjGHB7rvEE48gVidu1cRM5H5pBPXMCDI9hTGOXWNN61vnP4eHDYS/dtHMiAN2ag6Qyy5kmQFzT13PkMp7DMI/r61bQJcJIhVVQ0GGmRz91zO0knwq3cqYR7tjFW8rNmEaCdisEDrGVjVb/DZRr9as/JuJxGljCpL3GAV41BkE6nT18KorNdUBDM/haLIosF7YT49EftW/l3kXFNkJQ2x3S10tlzAAhSEBzbNr4kmtF5c5Xw2BULbQFhvcKqDPkANK9qT400rQyxsDrzsTvy5D9xpGita3VKjbgwG7DxOZSXLs1HNKVp626bhJymKKdkqVVinRQoXOBThTyKbQhJRS0UIUkURToooQmxS0RS0ITYoy08CihCjy0lTAUhWhCyf414NG7B1gXBmBMashjQ+MEE/WspuYZzouk1uHPfBvxLgkGBoI8v08feqmOWHVh4ekmlywmSdqfo2gMF0zy66HBWD4U8ppYsjE3Fm85ORm1KINNPAkz7VodefyzhCmGRW3733YkV62SrKTYYErWeXvJKgKzofvWV8+fDy1bDYnDSiz3rQ+VZ/c/dWemw6QNtZyVBxKzms3F3lG09ql4lpUUX3Hh0SvnbD8Lc7itC+GnClW7mJYZQSqjRcxESfOCagbhbSYgV7vKeFZLgP/oKquYSnKtpvCASrzlp2SnAUsUws9My0gFS0hFCEyKIp0UtCFHlpjCpSKawoQoqKfFFCFKRSRT6KEJhFMFSGmRQhLSGikY0IT1p8VEDUgNCFwYjChmJqI4FfCvTIppFRCmU2ykACpZpKKlQikcaR40tEUIVdvYAE7H+vOurCYQKQa9R7Y3oVBUALoulSrtS0lLNSuUUUtJQhJRSmkoQg02KdNAoQm5aKdRQhLSGiihCbQaKKEJDTTRRQhJUi0UUIQaBRRQhBpRRRQhLRRRQhI1MFFFCE+lFFFCEUtFFCEUlFFCElAoooQlooooQv//Z",
                150,false));

        this.jogos.add(new Jogo( 2,
                "Sonic","Jogo muito bom",
                "https://m.media-amazon.com/images/I/819FeWyME2L._AC_UF1000,1000_QL80_.jpg",
                200,false));

        this.jogos.add(new Jogo(3,"Good of war","Um otimo jogo",
                "data:image/jpeg;base64,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",
                150,false));

        this.jogos.add(new Jogo(4,"Ben 10", "Um otimo jogo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRsfM7uTT-J2wA4JfnDDip4b-dehxXfSoMGQ&usqp=CAU",
                250,false));

    }

    public List<Jogo> findAll(){
        return jogos;
    }
    public Jogo save(Jogo jogo){
        for (Jogo jogo1: jogos){
            if(jogo.getId()== jogo1.getId()){
                return null;
            }
        }
        jogos.add(jogo);
        return jogo;


    }
}
