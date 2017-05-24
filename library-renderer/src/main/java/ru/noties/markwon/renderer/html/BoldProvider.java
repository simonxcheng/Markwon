package ru.noties.markwon.renderer.html;

import android.support.annotation.NonNull;

import ru.noties.markwon.spans.StrongEmphasisSpan;

class BoldProvider implements SpannableHtmlParser.SpanProvider {

    @Override
    public Object provide(@NonNull SpannableHtmlParser.Tag tag) {
        return new StrongEmphasisSpan();
    }
}
